package Polymorphism;

public class Bike extends Vehicle {
    private String color;
    public Bike(String brand, int speed, String color){
        super(brand, speed);
        this.color = color;
    }

    public void start(){
        System.out.println("Bike starting...........");
    }
}
