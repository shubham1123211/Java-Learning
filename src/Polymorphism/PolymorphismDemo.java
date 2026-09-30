package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("bmw", 200);
        v1.start();

        Vehicle v2 = new Car("Farari", 400, 4);
        v2.start();

        Vehicle v3 = new Bike("Honda", 180,"Black");
        v3.start();
    }
}
