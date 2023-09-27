package Poject;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("f-132", 2000);
        System.out.println(vehicle.toString());
        /*
        vehicle.gas();
        vehicle.breaking();
        System.out.println(vehicle.getModel());

         */

        Vehicle vehicle1 = new Vehicle("f-132", 2000);
        /*
        System.out.println(vehicle1.toString());

        vehicle1.setModel("f-132");

         */

        Car car = new Car("Polo", 2011);
        System.out.println(car.getModel());
        System.out.println(car.toString());
        car.gas();

        car.goToRoute(1000);
        System.out.println("Сечас пробег авто: " + car.getMileage() );

        Bus bus =  new Bus("Sprinter", 2022, 23);
        System.out.println(bus.toString());
        bus.gas();
        bus.goToRoute(150);
        bus.takePassenger();
        System.out.println("Es gibt "+bus.getCauntPassager() + "Fahrgast im Bus");



    }
}
