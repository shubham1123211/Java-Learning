package MiniProjects.Inheritance;

public class Car extends Vehicle{
    private int noOfDoors;
    public Car(String brand, int speed, int noOfDoors) {
        super(brand, speed);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void getDetails() {
        System.out.println("Brand : "+getBrand());
        System.out.println("Speed : "+getSpeed());
        System.out.println("noOfDoors : "+noOfDoors);
    }
}
