package lesson_20;

public class Car {
    private String name;
    private int powerPs;
    static  int numberOfCars; // статические переменные можно и надо  тоже инкапсулировать
    /*
    При создании объекта используется конструктор. При каждом новом созданном объекте
    статическая переменная увеличивается на еденичку.
    Статическая переменная принадлежит не конкретно одному объекту, а всему классу

    Для каждого объекта этого класса будет увеличиваться один и тот же экземпляр переменной numberOfCars

Причины использовать статические поля:

Когда значение поля должно быть общим для всех объектов класса, в котором оно определено
Когда значение поля не зависит от наличия объектов класса, в котором оно определено
Когда значение поля может быть изменено из любого объекта класса, в котором оно определено
Особенности использования:

Статические переменные могут быть созданы только, как переменные класса.
В методе main  они создаваться не могут
К статическим полям класса можно получить доступ без создания объекта, используя имя класса (ссылка на объект не нужна)
Несмотря на то, что получить доступ к статическим полям можно с помощью ссылки на объект (например, car1.numberOfCars),
мы должны воздерживаться от её применения, поскольку в этом случае становится не совсем понятно,
является ли эта переменная переменной экземпляра или же переменной класса. Вместо этого всегда необходимо
ссылаться на статические переменные, используя имя класса (например, Car.numberOfCars)
     */

    public Car(String name, int powerPs) {
        this.name = name;
        this.powerPs = powerPs;
        numberOfCars++;
    }
//    чтобы получить доступ к закрытым полям пишем геттеры
//    ____________________________________________________
    public String getName(){
        return name;
    }
    public int getPowerPS() {
        return powerPs;
    }
//--------------------------------------------------------------
    static void showStaticInfo(){
        System.out.println("Всего машин: " + numberOfCars);
    }
}