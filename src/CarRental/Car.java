package CarRental;

public class Car {
    String Id;
    String brand;
    String model;
    int pricePerDay;
    boolean isAvailable;


    public Car(String id, String brand, String model, int pricePerDay) {
        this.Id = id;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = Boolean.TRUE;
    }

    Boolean getAvailability(){
        return this.isAvailable;
    }

    void setAvailability(Boolean availability){
        this.isAvailable = availability;
    }

}
