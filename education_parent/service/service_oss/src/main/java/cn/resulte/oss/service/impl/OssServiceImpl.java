package cn.resulte.oss.service.impl;

import cn.resulte.oss.service.OssService;
import cn.resulte.oss.utils.ConstantPropertiesUtils;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.util.UUID;


@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadFileAvatar(MultipartFile file) {
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.ACCESS_KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.ACCESS_KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;

       try {
           // 创建OSSClient实例。
           OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

           // 上传文件流。
           InputStream inputStream = file.getInputStream();
           String filename = file.getOriginalFilename();

           String uuid = UUID.randomUUID().toString().replaceAll("-", "");
           filename = uuid + filename;
           String datePath = new DateTime().toString("yyyy/MM/dd");
           filename = datePath +"/" + filename;

           ossClient.putObject(bucketName, filename, inputStream);

           // 关闭OSSClient。
           ossClient.shutdown();

           String url = "https://"+bucketName+"."+endpoint+"/"+filename;
           return url;
       }catch (Exception e){
           e.printStackTrace();
           return null;
       }
    }
}
