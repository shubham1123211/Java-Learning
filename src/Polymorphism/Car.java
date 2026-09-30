package Polymorphism;

public class Car extends Vehicle {
    private int noOfTires;
    public Car(String brand, int speed, int noOfTires){
        super(brand, speed);
        this.noOfTires = noOfTires;
    }
    public void start(){
        System.out.println("Car starting.........");
    }
}
