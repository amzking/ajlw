package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonStationZM;
import com.ccue.ajlw.pojo.person.PersonStation;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonStationProducer implements Producer<PersonStation, PersonStationZM> {
    public List<PersonStation> produce(List<PersonStationZM> personStationZMS) {
        return null;
    }
}
