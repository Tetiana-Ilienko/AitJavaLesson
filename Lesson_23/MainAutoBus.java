package Lesson_23;

public class MainAutoBus {
    public static void main(String[] args) {
        AutoBus bus = new AutoBus("Sprinre",20);
        System.out.println(bus.toString());
        BusDriver driver = new BusDriver("Bob",35);
        System.out.println(driver.toString());
        bus.setDriver(driver);
        System.out.println(bus.toString());
//        ******************************

        BusDriver driver1 = new BusDriver("John", 28);
        AutoBus bus1 = new AutoBus("Vito", 12, driver1);
        System.out.println(bus1.toString());
//        bus1.setDriver(driver);
        System.out.println(bus.toString());

        System.out.println("*********************************");
        System.out.println(bus.getAutoPilotInf0().toString());
     /*
        AutoPilot autoPilotGetting = bus.getAutoPilot();
        autoPilotGetting.setModel("sfdg");
        autoPilotGetting.setActive(true);
        автопилот не должен попадать в руки пользователю. Вот примерная ошибка, пользователь
         заменил  данные. Нужно отдавать либо копию объекта или же какоето строковое представление
         getAutoPilotInf0()  получили строковое представление о автопилоте
         мы его инкапсулировали.

      */
        bus.moveByAutopilot();
        bus.moveByDriver();

        System.out.println("****************************************");
        BusDriver driver2 = new BusDriver("Marsel", 35); //  создала водителя
        System.out.println(driver2.toString());

        driver2.addCategories("D"); //  добавила категорию
        driver2.addCategories("С");
        driver2.addCategories("F");
        driver2.addCategories("A");

        System.out.println(driver2.toString());

        driver2.removeCategories("N");
//

        System.out.println(driver2.toString());
        driver2.removeCategories("F");
        System.out.println(driver2.toString());
        driver2.removeAllCategories();
        System.out.println(driver2.toString());



    }
}
