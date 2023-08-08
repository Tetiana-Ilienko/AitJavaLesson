package homeWork_16;

public class Kettle {
    int kettleCapacity;
    boolean isOn;

    public Kettle( int capacity){
        this.kettleCapacity = capacity;
    }
    public Kettle(){
    }

    public void turnOn(boolean isOn ){
        if (isOn ==false){
            System.out.println("Turn on the Kettle");
        } else {
            System.out.println("Kettle is already on");
        }
    }
    public void turnOff(boolean isOn ){
        if (isOn == true){
            System.out.println("Turn off the Kettle");
        } else {
            System.out.println("Kettle is already off");
        }
    }


}
