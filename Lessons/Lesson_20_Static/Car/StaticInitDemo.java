package Car;

public class StaticInitDemo {
    //    инициализация статического блока
//    статические блоки запиываются до конструктора и создаются один раз
//    _______________________________________________
//    блоки инициализации выполняются попорядку
//
//    Важно!!!! если по другому - будет ошибка
    private static Car[] cars; //  статическое поле

    static {                   // статический блок инициализации
        cars = new Car[3];
        Car car = new Car("Bmw", 200); // прописали значения
        Car car1 = new Car("Seat", 300);
        Car car2 = new Car("Skoda", 150);
        cars[0] = car1;             // инициализировали
        cars[1] = car;
        cars[2] = car2;
    }


    //    не статический блок инициализации
//    _____________________________________________
    private String[] strings;

    {
        strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = strings[0] + ", " + strings[1];
    }
    public StaticInitDemo() { // конструктор
        // initString(); тоже вариант инициализации полей начальными значениями
    }
    private void initString() {
        strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = strings[0] + ", " + strings[1];
    }

    //    _________________________________________________________________
// в нестатическом методе получем долступ к значениям и можем ими опрерировать
    public void showAllCars() {
        System.out.println("Всего машин " + cars.length);
        System.out.print("[");
        for (Car carCurrent : cars) {
            System.out.print(carCurrent.getName() + ": " + carCurrent.getPowerPS() + ", ");
        }
        System.out.print("]\n");
    }

    //    _________________________________________________________________
    public static void main(String[] args) {
        StaticInitDemo staticDemo = new StaticInitDemo();
        staticDemo.showAllCars();

    }
}
