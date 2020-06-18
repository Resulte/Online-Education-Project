package cn.resulte.eduservice.service;

import cn.resulte.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author Resulte
 * @since 2020-05-14
 */
public interface EduTeacherService extends IService<EduTeacher> {

    Map<String,Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
