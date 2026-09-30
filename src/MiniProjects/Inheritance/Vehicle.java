package MiniProjects.Inheritance;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void getDetails() {
        System.out.println("Vehicle with brand : "+brand+" and with Speed : "+speed);
    }
    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }
}
