package HomeWork_24;

public class Human {

    private int speed;// Приватное поле для хранения скорости человека.
    private int timeRest; // Приватное поле для хранения времени отдыха человека.


    public Human() { // Конструктор класса. Вызывает метод definitionVar() для инициализации переменных.
        definitionVar();
    }
// __________________________________________________________________
//    геттеры и сеттеры
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getTimeRest() {
        return timeRest;
    }
    public void setTimeRest(int timeRest) {
        this.timeRest = timeRest;
    }
//___________________________________________________________________________________________________
    public void definitionVar(){ // Метод для инициализации переменных. Устанавливает скорость в 10 и время отдыха в 15.
        setSpeed(10);
        setTimeRest(15);
    }

    public void canRun(){
        System.out.println("Человек умеет бегать со скоростью:" + getSpeed());
        needForRest();
    }

    public void needForRest(){
        System.out.println(" Человек, теперь ты должен отдохнуть" + getTimeRest());
    }
}
