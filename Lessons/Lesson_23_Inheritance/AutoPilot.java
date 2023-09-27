package Lesson_23;

public class AutoPilot {
    private final int id;
    //    private final String model = "AP-001"; // как вариант прописывания автопилота(композиция)
    private String model;
    private final AutoBus bus; // автопилот знает, в какой автобус он встроен
    private boolean isActive; // false
    static int counter;

    public AutoPilot(String model, AutoBus bus) {
        this.model = model;
        this.bus = bus;
        this.id = counter++;
    }

    //__________________________________________________
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AutoBus getBus() {
        return bus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //    _____________________________________
    public String toString() {
        return "{  id:" + id + "; model:" + model + "; встроен в автобус id:" +
                " " + bus.getId() + "}";
    }

    public void driveBus() {
      turnOn();
        System.out.println("автопилот id:" + id + ",  управляет автобусом id:" + bus.getId()
                + " " + bus.getModel());
    }

    public void turnOff() {
        isActive = false;
        System.out.println("Автопилот " + id + " выключен");
    }
    public void turnOn() {
        isActive = true;
        System.out.println("Автопилот " + id + " включен");
    }
}
