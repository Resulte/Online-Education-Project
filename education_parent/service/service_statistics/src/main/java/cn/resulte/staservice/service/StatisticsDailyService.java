package cn.resulte.staservice.service;

import cn.resulte.staservice.entity.StatisticsDaily;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 网站统计日数据 服务类
 * </p>
 *
 * @author Resulte
 * @since 2020-06-12
 */
public interface StatisticsDailyService extends IService<StatisticsDaily> {

    void registerCount(String day);

    Map<String,Object> getShowData(String type, String begin, String end);
}
