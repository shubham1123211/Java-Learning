package Inheritance;

public class Car extends Vehicle {
    private int gear;

    Car(String brand, int numberOfTiers, int speed, int gear) {
        super(brand, numberOfTiers, speed);
        this.gear = gear;
    }
}
