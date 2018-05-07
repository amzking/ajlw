package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonOvertimeAlarmZM;
import com.ccue.ajlw.pojo.person.PersonTimeout;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonTimeoutProducer implements Producer<PersonTimeout, PersonOvertimeAlarmZM> {
    public List<PersonTimeout> produce(List<PersonOvertimeAlarmZM> personOvertimeAlarmZMS) {
        return null;
    }
}
