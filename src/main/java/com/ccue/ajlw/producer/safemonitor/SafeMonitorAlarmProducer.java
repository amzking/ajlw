package com.ccue.ajlw.producer.safemonitor;

import com.ccue.ajlw.parser.zmpojo.safemonitor.SafeMonitorAlarmZM;
import com.ccue.ajlw.pojo.safemonitor.SafeMonitorAlarm;
import com.ccue.ajlw.producer.Producer;

import java.util.List;

public class SafeMonitorAlarmProducer implements Producer<SafeMonitorAlarm, SafeMonitorAlarmZM> {
    public List<SafeMonitorAlarm> produce(List<SafeMonitorAlarmZM> safeMonitorAlarmZMS) {
        return null;
    }
}
