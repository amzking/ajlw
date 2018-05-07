package com.ccue.ajlw.parser.collector;

import java.util.List;

public interface Collector<T> {

    List<T> collect();

}
