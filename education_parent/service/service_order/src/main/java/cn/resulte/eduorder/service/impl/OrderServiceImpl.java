package cn.resulte.eduorder.service.impl;

import cn.resulte.commonutils.CourseWebVoOrder;
import cn.resulte.commonutils.UcenterMemberOrder;
import cn.resulte.eduorder.client.EduClient;
import cn.resulte.eduorder.client.UcenterClient;
import cn.resulte.eduorder.entity.Order;
import cn.resulte.eduorder.mapper.OrderMapper;
import cn.resulte.eduorder.service.OrderService;
import cn.resulte.eduorder.utils.OrderNoUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author Resulte
 * @since 2020-06-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private EduClient eduClient;
    @Autowired
    private UcenterClient ucenterClient;
    
    @Override
    public String createOrders(String courseId, String memberId) {
        CourseWebVoOrder courseInfoOrder = eduClient.getCourseInfoOrder(courseId);
        UcenterMemberOrder userInfoOrder = ucenterClient.getUserInfoOrder(memberId);

        //创建Order对象，向order对象里面设置需要数据
        Order order = new Order();
        order.setOrderNo(OrderNoUtil.getOrderNo());//订单号
        order.setCourseId(courseId); //课程id
        order.setCourseTitle(courseInfoOrder.getTitle());
        order.setCourseCover(courseInfoOrder.getCover());
        order.setTeacherName(courseInfoOrder.getTeacherName());
        order.setTotalFee(courseInfoOrder.getPrice());
        order.setMemberId(memberId);
        order.setMobile(userInfoOrder.getMobile());
        order.setNickname(userInfoOrder.getNickname());
        order.setStatus(0);  //订单状态（0：未支付 1：已支付）
        order.setPayType(1);  //支付类型 ，微信1
        baseMapper.insert(order);
        //返回订单号
        return order.getOrderNo();
    }
}
