package Inheritance;

public class Bike extends Vehicle{
    private final int bikePrice;
    Bike(String brand, int numberOfTiers, int speed, int bikePrice) {
        super(brand, numberOfTiers, speed);
        this.bikePrice = bikePrice;
    }
    public int getBikePrice() {
        return bikePrice;
    }
}
