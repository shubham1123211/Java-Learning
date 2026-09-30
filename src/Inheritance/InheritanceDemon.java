package Inheritance;

public class InheritanceDemon {
    static void main(String[] args) {
//        Car car1 = new Car("BMW", 4, 200, 6);
//        System.out.println(car1.getBrand());
//        System.out.println(car1.getNumberOfTiers());
//        System.out.println(car1.getSpeed());
//        car1.showDetails();

//        Car car2 = new Car("Audi", 4, 150, 6);
//        car2.showDetails();

        Bike bike1 = new Bike("Honda", 2, 300, 150000);
        bike1.showDetails();
        System.out.print(bike1.getBikePrice());
        System.out.println("_--------------_");
        System.out.println(bike1);
    }
}
