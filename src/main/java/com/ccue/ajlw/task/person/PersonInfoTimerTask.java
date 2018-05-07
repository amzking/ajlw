package com.ccue.ajlw.task.person;


import com.ccue.ajlw.producer.person.PersonInfoProducer;
import com.ccue.ajlw.task.TimerTask;
import com.ccue.ajlw.utils.SpringContextUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PersonInfoTimerTask implements TimerTask{

    @Scheduled(cron = "0/2 * * * * ?")
    public void task() {
        PersonInfoProducer p = (PersonInfoProducer)SpringContextUtil.getBean(PersonInfoProducer.class);
        p.produce(null);
    }


}
