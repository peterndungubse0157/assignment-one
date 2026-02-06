// BSD 214 - Assignment 1
// Simple Car Rental System using OOP

class Car {
    String carId;
    boolean available = true;

    Car(String carId) {
        this.carId = carId;
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

class RentalAgency {

    // Method to rent a car
    void rentCar(Car car, Customer customer) {
        if (car.available) {
            car.available = false;
            System.out.println(customer.name + " rented car " + car.carId);
        } else {
            System.out.println("Car not available");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("C101");
        Customer customer = new Customer("John");
        RentalAgency agency = new RentalAgency();

        agency.rentCar(car, customer);
    }
}
