package Poject;

public class Bus extends Car {

    private int capacity;
    private int cauntPassager;

    public Bus(String model, int yearOfManufacture, int capaciti) {
        super(model, yearOfManufacture);
        this.capacity = capaciti;
    }
    public int getCauntPassager(){
        return cauntPassager;
    }


    public int getCapaciti() {
        return capacity;
    }

    public void setCapaciti(int capaciti) {
        this.capacity = capaciti;
    }

    public void takePassenger() {
        System.out.println(" Fahrgast einsteigen. ");
        cauntPassager++;
    }

    public void autPassenger() {
        System.out.println(" Fahrgast aussteigen. ");
        cauntPassager--;
        cauntPassager = cauntPassager < 0 ? 0 : cauntPassager;
    }
}
