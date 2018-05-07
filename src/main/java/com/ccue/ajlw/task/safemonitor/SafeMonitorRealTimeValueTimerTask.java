package com.ccue.ajlw.task.safemonitor;

import com.ccue.ajlw.task.TimerTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SafeMonitorRealTimeValueTimerTask implements TimerTask {
    @Scheduled(cron = "0/2 * * * * ?")
    public void task() {

    }
}
