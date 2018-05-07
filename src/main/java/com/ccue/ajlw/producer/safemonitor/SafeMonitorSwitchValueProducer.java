package com.ccue.ajlw.producer.safemonitor;

import com.ccue.ajlw.parser.zmpojo.safemonitor.SafeMonitorValueRecordZM;
import com.ccue.ajlw.pojo.safemonitor.SafeMonitorSwitchValue;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class SafeMonitorSwitchValueProducer implements Producer<SafeMonitorSwitchValue, SafeMonitorValueRecordZM> {
    public List<SafeMonitorSwitchValue> produce(List<SafeMonitorValueRecordZM> safeMonitorValueRecordZMS) {
        return null;
    }
}
