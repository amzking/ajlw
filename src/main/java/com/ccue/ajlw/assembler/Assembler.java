package com.ccue.ajlw.assembler;

import java.util.List;

public interface Assembler<T> {

    String generate(List<T> list);

    String getFileName();

}
