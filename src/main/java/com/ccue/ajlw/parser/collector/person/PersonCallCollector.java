package com.ccue.ajlw.parser.collector.person;

import com.ccue.ajlw.parser.collector.Collector;
import com.ccue.ajlw.parser.zmpojo.person.PersonCallAlarmZM;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonCallCollector implements Collector<PersonCallAlarmZM> {
    public List<PersonCallAlarmZM> collect() {
        return null;
    }
}
