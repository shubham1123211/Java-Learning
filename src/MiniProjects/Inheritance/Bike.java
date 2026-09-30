package MiniProjects.Inheritance;

public class Bike extends Vehicle{
    private boolean hasGear;
    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void getDetails() {
        System.out.println("Brand : "+getBrand());
        System.out.println("Speed : "+getSpeed());
        System.out.println("Has gear : "+hasGear);
    }
}
