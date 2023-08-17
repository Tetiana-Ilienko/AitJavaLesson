package lesson_20;

/// статические методы
public class MainCar {
    int noStatic = 10; //не статическое (динамическое) поле класса
    static int staticOnt = 10;// стическое поле

    /*
    статический метод -  принадлежит классу, а не объекту
     *///_________________________________________________________________________
    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Skoda", 110);
        Car car2 = new Car("Seat", 120);

        // Car.numberOfCars = 13; // !!! Статические поля тоже нужно закрывать от прямого доступа. Инкапсулировать
//       иначе получается ерунда. Создано три машины, а пользователь
//        может добраться до статической переменной и изменить ее.

        System.out.println(" Всего создано машин: " + Car.numberOfCars);
        /* хороший тон - обращаться ко всему классу, когда нужно вызвать
        статическую переменную, а не к созданному объекту
         */
///      вызов статического метода
//        _____________________________________________________
        System.out.println(" Сумма чисел: " + MathUtils.sumOfInts(5, 6, 7, 8));
//        //  вызываем еще один статический метод обращение к статик методу возможно от имени экземпляра класса.
         //   Но так делать НЕ НУЖНО!
        Car.showStaticInfo();
    }

    static void test() {  //  доступ из статического метода есть только к статическим членам
        staticOnt++;
    }

    public void testNotStatic() {
        /*
        В обычных методах есть доступ ко всем полям класса, как статическим, так не статичеким
         */
    }
}