package com.ccue.ajlw.producer.safemonitor;

import com.ccue.ajlw.parser.zmpojo.safemonitor.SafeMonitorTagValueZM;
import com.ccue.ajlw.pojo.safemonitor.SafeMonitorRealTimeValue;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class SafeMonitorRealTimeValueProducer implements Producer<SafeMonitorRealTimeValue, SafeMonitorTagValueZM> {
    public List<SafeMonitorRealTimeValue> produce(List<SafeMonitorTagValueZM> safeMonitorTagValueZMS) {
        return null;
    }
}
