package Two;



public class ClassObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";

//        car1.drive(300);

        Car car2 = new Car();
        car2.brand = "Hyundai";
        car2.color = "Blue";
        car2.drive(300);


    }
}
