package HomeWork_22;

public class AlarmClock extends Clock {

    private boolean isAlarm;

    public AlarmClock(String brand, String model, int yearOfManufacture) {
        super(brand, model, yearOfManufacture);
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }

    public boolean isAlarm() {
        return isAlarm;
    }


    public void ringAlarm(int hours, int minutes, int secundes) {
        if (isAlarm()) {
            System.out.println("Будильник звонит");
            whatTimeIs(hours,minutes,secundes);
        } else {
            System.out.println("Будильник отключен");
        }
    }
}
