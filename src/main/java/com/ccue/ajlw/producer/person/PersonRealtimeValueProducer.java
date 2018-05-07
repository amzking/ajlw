package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonRealDataZM;
import com.ccue.ajlw.pojo.person.PersonRealtimeValue;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonRealtimeValueProducer implements Producer<PersonRealtimeValue, PersonRealDataZM> {
    public List<PersonRealtimeValue> produce(List<PersonRealDataZM> personRealDataZMS) {
        return null;
    }
}
