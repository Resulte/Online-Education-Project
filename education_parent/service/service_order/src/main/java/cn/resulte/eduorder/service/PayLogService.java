package cn.resulte.eduorder.service;

import cn.resulte.eduorder.entity.PayLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 支付日志表 服务类
 * </p>
 *
 * @author Resulte
 * @since 2020-06-11
 */
public interface PayLogService extends IService<PayLog> {

    Map createNatvie(String orderNo);

    Map<String,String> queryPayStatus(String orderNo);

    void updateOrdersStatus(Map<String, String> map);
}
