package HomeWork_23;

public class Clock {
    private String brand;  //  марка часов
    private String model;    // модель часов ( наручная, настенная, настольная и тд
    private int yearOfManufacture; // год производства
    //    private String movementType; // тип механизма
    //private boolean isAnalogDisplay; //   поле для определения типа дисплея (со стрелками или табло)

    public Clock(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;

    }


    public String toString() {
        return "{ марка часов: " + brand + "; модель часов: " + model + "; год производства: " + yearOfManufacture + " }";
    }

    public void whatTimeIs(int hours, int minutes, int secundes) {
                  System.out.println("Время: " + hours + ":" + minutes + ":" + secundes);
        }
    }


