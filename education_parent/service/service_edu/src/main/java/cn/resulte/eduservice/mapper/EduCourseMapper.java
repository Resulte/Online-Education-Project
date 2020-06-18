package cn.resulte.eduservice.mapper;

import cn.resulte.eduservice.entity.EduCourse;
import cn.resulte.eduservice.entity.frontvo.CourseWebVo;
import cn.resulte.eduservice.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author Resulte
 * @since 2020-06-06
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getPublishCourseInfo(String courseId);

    CourseWebVo getBaseCourseInfo(String courseId);
}
