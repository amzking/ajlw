package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonPreinstallZM;
import com.ccue.ajlw.pojo.person.PersonPreinstall;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonPreinstallProducer implements Producer<PersonPreinstall, PersonPreinstallZM> {
    public List<PersonPreinstall> produce(List<PersonPreinstallZM> personPreinstallZMS) {
        return null;
    }
}
