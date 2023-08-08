package homeWork_16;

public class Clock {
    int hours;
    int minutes;
    int seconds;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tikTak() {
        System.out.println("Time is :" + hours + "." + minutes + "." + seconds);
    }
}
