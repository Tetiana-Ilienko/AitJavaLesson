package Lesson_22;

public class Vehicle {
    private  String model;
    private  int yearOfManufacture;
    private final int id;
    static  private int globalCounter;


    public  Vehicle(String model, int yearOfManufacture){
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.id = globalCounter;
        globalCounter++;
    }
    public int getId(){
        return id;
    }

    public String getModel(){
        return model;
    }

    public int getYearOfManufacture(){
        return yearOfManufacture;
    }




    public String toString(){
        return "{ id" + id + "; Model " + model + "; year Of  man: " + yearOfManufacture + " }";

    }
    public void gas(){
        System.out.println(" Ich fahre ");
    }
    public void breaking(){
        System.out.println(" Ich bremse");
    }
}

