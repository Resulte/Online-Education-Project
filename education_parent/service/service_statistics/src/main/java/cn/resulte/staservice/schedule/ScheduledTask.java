package cn.resulte.staservice.schedule;

import cn.resulte.staservice.service.StatisticsDailyService;
import cn.resulte.staservice.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTask {

    @Autowired
    private StatisticsDailyService dailyService;

    //每天凌晨1点查询前一天的记录
    @Scheduled(cron = "0 0 1 * * ?")
    public void Task1(){
        dailyService.registerCount(DateUtil.formatDate(DateUtil.addDays(new Date(), -1)));
    }
}
