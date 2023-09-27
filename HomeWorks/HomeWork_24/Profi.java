package HomeWork_24;

public class Profi extends Human{




//    public  Profi() { // пустой конструктор - можно не прописывать - вызовется автоматически
//        super();
//    }
    /*
    примеры конструктора
    public Profi() {
    super(); // Вызывает конструктор без аргументов класса Human
}

public Profi(int customSpeed, int customTimeRest) {
    super(); // Вызывает конструктор без аргументов класса Human
    setSpeed(customSpeed);
    setTimeRest(customTimeRest);
}
     */

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(25);
    }

    @Override
    public void setTimeRest(int timeRest) {
        super.setTimeRest(5);
    }

    @Override
    public void canRun(){
        System.out.println("Профи умеет бегать со скоростью:  " + getSpeed());
        needForRest();
    }
    @Override
    public void needForRest(){
        System.out.println(" Профи, теперь ты должен отдохнуть: " + getTimeRest());
    }

}
