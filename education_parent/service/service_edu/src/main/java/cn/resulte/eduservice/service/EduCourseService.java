package cn.resulte.eduservice.service;

import cn.resulte.eduservice.entity.EduCourse;
import cn.resulte.eduservice.entity.frontvo.CourseFrontVo;
import cn.resulte.eduservice.entity.frontvo.CourseWebVo;
import cn.resulte.eduservice.entity.vo.CourseInfoVo;
import cn.resulte.eduservice.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Resulte
 * @since 2020-06-06
 */
public interface EduCourseService extends IService<EduCourse> {

    String saveCourseInfo(CourseInfoVo courseInfoVo);

    CourseInfoVo getCourseInfo(String courseId);

    void updateCourseInfo(CourseInfoVo courseInfoVo);

    CoursePublishVo publishCourseInfo(String id);

    void removeCourse(String courseId);

    Map<String,Object> getCourseFrontList(Page<EduCourse> pageParam, CourseFrontVo courseFrontVo);

    CourseWebVo getBaseCourseInfo(String courseId);
}
