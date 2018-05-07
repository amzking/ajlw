package com.ccue.ajlw.producer.safemonitor;

import com.ccue.ajlw.parser.zmpojo.person.MineInfoZM;
import com.ccue.ajlw.pojo.safemonitor.MineInfo;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class MineInfoProducer implements Producer<MineInfo, MineInfoZM> {
    public List<MineInfo> produce(List<MineInfoZM> mineInfoZMS) {
        return null;
    }
}
