package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.filter.anotation.Filter;
import com.ccue.ajlw.filter.filtertool.impl.FieldFilter;
import com.ccue.ajlw.parser.zmpojo.person.PersonExceptionZM;
import com.ccue.ajlw.parser.zmpojo.person.PersonInfoZM;
import com.ccue.ajlw.pojo.person.PersonException;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class PersonExceptionProducer implements Producer<PersonException, PersonExceptionZM> {

    @Filter(value = PersonExceptionZM.class, filter = FieldFilter.class)
    public List<PersonException> produce(List<PersonExceptionZM> personExceptionZMS) {
        return null;
    }
}
