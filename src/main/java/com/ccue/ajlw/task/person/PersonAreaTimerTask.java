package com.ccue.ajlw.task.person;

import com.ccue.ajlw.assembler.person.PersonAreaAssembler;
import com.ccue.ajlw.parser.collector.person.PersonAreaCollector;
import com.ccue.ajlw.parser.zmpojo.person.PersonAreaZM;
import com.ccue.ajlw.pojo.person.PersonArea;
import com.ccue.ajlw.producer.person.PersonAreaProducer;
import com.ccue.ajlw.task.TimerTask;
import com.ccue.ajlw.utils.SpringContextUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.List;

@Component
public class PersonAreaTimerTask implements TimerTask {

    @Scheduled(cron = "0/2 * * * * ?")
    public void task() {
/*

        PersonAreaCollector collector = (PersonAreaCollector) SpringContextUtil.getBean(PersonAreaCollector.class);
        List<PersonAreaZM> list = collector.collect();

        PersonAreaProducer producer = (PersonAreaProducer) SpringContextUtil.getBean(PersonAreaProducer.class);
        List<PersonArea> personAreas = producer.produce(list);

        PersonAreaAssembler assembler = (PersonAreaAssembler)SpringContextUtil.getBean(PersonAreaAssembler.class);
        String strring = assembler.generate(personAreas);

*/


    }
}
