package com.ccue.ajlw.filter.filtertool.impl;

import com.ccue.ajlw.filter.filtertool.IFilter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class FieldFilter implements IFilter, InitializingBean{

    private Set<String> disabledValues;

    public List filterData(List list) {
        return null;
    }

    public void updateConfig() {

    }

    public void afterPropertiesSet() throws Exception {
        // 将要过滤的值加入set
    }
}
