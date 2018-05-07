package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.filter.anotation.Filter;
import com.ccue.ajlw.parser.zmpojo.person.PersonCallAlarmZM;
import com.ccue.ajlw.pojo.person.PersonCall;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonCallProducer implements Producer<PersonCall, PersonCallAlarmZM> {
    @Filter(value = PersonCallAlarmZM.class, field = "personCardNum")
    public List<PersonCall> produce(List<PersonCallAlarmZM> personCallAlarmZMS) {
        return null;
    }
}
