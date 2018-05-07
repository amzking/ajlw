package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.parser.zmpojo.person.PersonSpecialZM;
import com.ccue.ajlw.pojo.person.PersonSpecial;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonSpecialProducer implements Producer<PersonSpecial, PersonSpecialZM> {
    public List<PersonSpecial> produce(List<PersonSpecialZM> personSpecialZMS) {
        return null;
    }
}
