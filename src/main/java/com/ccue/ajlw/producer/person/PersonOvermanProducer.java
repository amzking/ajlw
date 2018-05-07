package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonOvermanAlarmZM;
import com.ccue.ajlw.pojo.person.PersonOverman;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonOvermanProducer implements Producer<PersonOverman, PersonOvermanAlarmZM> {
    public List<PersonOverman> produce(List<PersonOvermanAlarmZM> personOvermanAlarmZMS) {
        return null;
    }
}
