package CarRental;

import java.util.Objects;

public class CarRentalFn {
    public void main(String[] args) {
        Car[] cars = {
                new Car("ab124", "BMW", "X5", 5600),
                new Car("cd245", "Toyota", "Fortuner", 3500),
                new Car("ef367", "Honda", "City", 1800),
                new Car("gh489", "Mercedes", "C-Class", 6500),
                new Car("ij501", "Audi", "A4", 5500)
        };
        showAvailableCars(cars);
        System.out.println("----------------------------------");
        rentCar(cars, "ef367");
        showAvailableCars(cars);
        System.out.println("---------------------------------");
        returnCar(cars, "ef367");
        showAvailableCars(cars);
        System.out.println("---------------------------------");
        showCarRentalDetails(cars, "gh489", 50);
    }
    static void showAvailableCars(Car[] cars){
        System.out.println("These are the all available cars");
        for (Car car : cars) {
            if(car.getAvailability()) {
                System.out.println(car.Id + " " + car.brand + " " + car.model);
            }
        }
    }

    static void rentCar(Car[] cars, String id){
        for(Car car : cars) {
            if(Objects.equals(car.Id, id)) {
                car.setAvailability(false);
                return;
            }
        }
        System.out.println("Car with id " + id + " is not available");
    }


    static void returnCar(Car[] cars, String id){
        for(Car car : cars) {
            if(Objects.equals(car.Id, id)) {
                car.setAvailability(true);
                break;
            }
        }
    }

    static void showCarRentalDetails(Car[] cars, String id, int numberOfDays){
        for (Car car : cars) {
            if(Objects.equals(car.Id, id)) {
                System.out.println(car.Id + " " + car.brand + " " + car.model);
                System.out.println("Days : " + numberOfDays);
                System.out.println("Price per day : " + car.pricePerDay);
                System.out.println("Total Price :" + car.pricePerDay * numberOfDays);
            }
        }
    }
}
