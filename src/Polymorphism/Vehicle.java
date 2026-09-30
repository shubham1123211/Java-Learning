package Polymorphism;

public class Vehicle {
    private String brand;
    private double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public double getSpeed() {
        return speed;
    }

    public void start(){
        System.out.println("Vehicle starting...........");
    }
}
