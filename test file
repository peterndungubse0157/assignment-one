// Test file for Car Rental System
public class RentalTest {
    public static void main(String[] args) {

        Car car = new Car("T202");
        Customer customer = new Customer("Alice");
        RentalAgency agency = new RentalAgency();

        // Test rent
        agency.rentCar(car, customer);

        // Test rent again (should fail)
        agency.rentCar(car, customer);

        // Test return
        agency.returnCar(car, customer);
    }
}
