package com.ccue.ajlw.producer;

import com.ccue.ajlw.pojo.BasePOJO;

import java.util.List;

public interface Producer<T extends BasePOJO, S> {

    List<T> produce(List<S> sList);

}
