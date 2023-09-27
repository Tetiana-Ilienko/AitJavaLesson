package Auto;

public class AutoBus {
    private final  int id;
    private String model;
    private int capacity;

    private BusDriver driver; //  связываем два класса (агрегация) автобус имеет водителя
    // "has -a"  связь
    static private int counterForId;

    //  внедряем автопилот
    private final AutoPilot autoPilot; // связь с автопилотом


    public AutoBus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.id = counterForId++;
        this.autoPilot = new AutoPilot("AP-001",this); //  автопилот создается в конструкторе
//        автобуса и привязывается намертво к создвнному автобусу
    }
    public AutoBus(String model,int capacity, BusDriver driver){ // агрегация. связываем водителя с автбусом
        this(model, capacity);
        this.driver = driver;

    }

    public String getAutoPilotInf0() {
        return autoPilot.toString();
    }

    public BusDriver getDriver() {
        return driver;
    }
    public void setDriver(BusDriver driver) { //  назначить водителя этого автобусв
        this.driver = driver;
    }

    public int getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public  String toString(){
        return "{ id: " + id +"; model: "+  model+ "; driver: "+ (driver==null?
                " { no driver} " : driver.toString())+ "автопилот: " + autoPilot.toString()+ "}";

    }
    public void moveByDriver(){ //  автобус начинает движеник
         //проверяем, включен ли автопилот
        if (autoPilot.isActive()) {
            autoPilot.turnOff();
//        водителю передается команда управления автобусом
        driver.driveBus(this);// в методе водителю передается ссылка
    }}



    public void moveByAutopilot() { // прописываем метод для автобуса - управление автопилотом
        autoPilot.driveBus();
    }

}
