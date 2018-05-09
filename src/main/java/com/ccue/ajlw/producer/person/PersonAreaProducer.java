package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.filter.anotation.Filter;
import com.ccue.ajlw.filter.filtertool.impl.FieldFilter;
import com.ccue.ajlw.parser.zmpojo.person.PersonAreaZM;
import com.ccue.ajlw.pojo.person.PersonArea;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonAreaProducer implements Producer<PersonArea, PersonAreaZM> {
    @Filter(value = PersonAreaZM.class, filter = FieldFilter.class)
    public List<PersonArea> produce(List<PersonAreaZM> personAreaZMS) {
        return null;
    }
}
