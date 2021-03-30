package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {

    //този тест няма да работи винаги защото имаме рандом! Ето защот в по-долния
    //тест ще ползваме мокване:
//    @Test
//    public void test() {
//        Alarm alarm = new Alarm(new Sensor());
//        alarm.check();
//        Assert.assertTrue(alarm.getAlarmOn());
//    }
    @Test
    public void when_pressureIsLowerThanLowPressureThreshold_then_alarmShouldBeOn() {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(15.5);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void when_pressureIsHigherThanHighPressureThreshold_then_alarmShouldBeOn () {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(21.01);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void when_pressureIsBetweenLowAndHighThresholds_then_alarmShouldBeOff () {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(17.001);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }

}