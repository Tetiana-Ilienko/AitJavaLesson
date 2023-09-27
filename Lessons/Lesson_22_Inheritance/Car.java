package Lesson_22;
// наследование
//  наследующий клас имеет доступ ко всем полям родительского класса
public class Car extends Vehicle{

    private int mileage;
    public Car(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }

    public int getMileage(){
        return mileage;
    }
    public  void goToRoute(int routeLength){
        System.out.println("Loss geht!");
        gas();
        breaking();
        mileage+=routeLength;


    }
}
