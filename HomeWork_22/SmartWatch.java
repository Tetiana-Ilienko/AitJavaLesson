package HomeWork_22;


public class SmartWatch extends AlarmClock {
    private boolean call;
    private boolean heartRateMonitor;

    public SmartWatch(String brand, String model, int yearOfManufacture) {
        super(brand, model, yearOfManufacture);
    }

    public boolean isCall() {
        return call;
    }

    public void setCall(boolean call) {
        this.call = call;
    }

    public boolean isHeartRateMonitor() {
        return heartRateMonitor;
    }

    public void setHeartRateMonitor(boolean heartRateMonitor) {
        this.heartRateMonitor = heartRateMonitor;
    }

    public void checkHeartRate(int rate) {
        if (isHeartRateMonitor())
            if (rate > 120) {
                System.out.println("Ваш пульс повышен");
            } else {
                System.out.println("Пульс в норме");
            }
        else {
            System.out.println("Отсутствует датчик пульса");
        }
    }

    public void callMobil() {
        if (isCall()) {
            System.out.println("Звонит телефон");
        }
    }
}

