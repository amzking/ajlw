package com.ccue.ajlw.task.person;

import com.ccue.ajlw.task.TimerTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PersonStationTimerTask implements TimerTask {
    @Scheduled(cron = "0/2 * * * * ?")
    public void task() {

    }
}
