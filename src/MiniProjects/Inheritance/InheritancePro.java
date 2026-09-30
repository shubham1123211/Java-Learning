package MiniProjects.Inheritance;

public class InheritancePro {
    static void main(String[] args) {
        Car car1 = new Car("BMW", 300, 4);
        Bike bike1 = new Bike("Honda", 180, true);

        showVehicle(car1);
        showVehicle(bike1);
    }

    public static void showVehicle(Vehicle vehicle) {
        vehicle.getDetails();
    }
}
