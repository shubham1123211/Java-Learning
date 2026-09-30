package Inheritance;

public class Vehicle {
    private final String brand;
    private final int numberOfTiers;
    private final int speed;

    Vehicle(String brand, int numberOfTiers, int speed) {
        this.brand = brand;
        this.numberOfTiers = numberOfTiers;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public int getNumberOfTiers(){
        return numberOfTiers;
    }

    public int getSpeed(){
        return speed;
    }

    public void showDetails(){
        System.out.println("Brand : " + brand);
        System.out.println("Number of tiers : " + numberOfTiers);
        System.out.println("Speed : " + speed);
    }

}
