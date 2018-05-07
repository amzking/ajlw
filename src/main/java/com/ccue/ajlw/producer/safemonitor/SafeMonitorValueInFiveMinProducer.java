package com.ccue.ajlw.producer.safemonitor;

import com.ccue.ajlw.parser.zmpojo.safemonitor.SafeMonitorValueRecordZM;
import com.ccue.ajlw.pojo.safemonitor.SafeMonitorValueInFiveMin;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class SafeMonitorValueInFiveMinProducer implements Producer<SafeMonitorValueInFiveMin, SafeMonitorValueRecordZM> {
    public List<SafeMonitorValueInFiveMin> produce(List<SafeMonitorValueRecordZM> safeMonitorValueRecordZMS) {
        return null;
    }
}
