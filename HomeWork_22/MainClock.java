package HomeWork_22;

public class MainClock {
    public static void main(String[] args) {

        Clock clock = new Clock("Casio", "настенные", 1980);
        System.out.println(clock.toString());;
        clock.setAnalogDisplay(false);

        System.out.println( "Часы аналоговые " + clock.isAnalogDisplay());
        clock.whatTimeIs(12,35,40);

        AlarmClock alarmClock = new AlarmClock("omega", "настольные", 2000);
        alarmClock.setAlarm(true);
        System.out.println(alarmClock.toString());
        alarmClock.setAlarm(true);
        alarmClock.ringAlarm(7,30,00);

        SmartWatch smartWatch = new SmartWatch("apple", "наручные",2022);
        smartWatch.setAnalogDisplay(false);
        smartWatch.setAlarm(true);
        smartWatch.setAnalogDisplay(false);
        System.out.println(smartWatch.toString());
        smartWatch.ringAlarm(12,48,25);
        smartWatch.setHeartRateMonitor(true);
        smartWatch.checkHeartRate(100);
        smartWatch.setCall(true);
        smartWatch.callMobil();





    }


}
