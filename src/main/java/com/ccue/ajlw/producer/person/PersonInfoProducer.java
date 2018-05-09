package com.ccue.ajlw.producer.person;

import com.ccue.ajlw.filter.anotation.Filter;
import com.ccue.ajlw.filter.filtertool.impl.FieldFilter;
import com.ccue.ajlw.parser.zmpojo.person.PersonInfoZM;
import com.ccue.ajlw.pojo.person.PersonInfo;
import com.ccue.ajlw.producer.Producer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonInfoProducer implements Producer<PersonInfo, PersonInfoZM> {

    @Filter(value = PersonInfoZM.class, filter = FieldFilter.class)
    public List<PersonInfo> produce(List<PersonInfoZM> list) {
        System.out.println("call produce : personInfoZM");


        return null;
    }
}
