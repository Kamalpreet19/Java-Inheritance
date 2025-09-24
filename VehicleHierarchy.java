/*Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses 
with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity 
for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and 
calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and 
use polymorphism for dynamic method calls.
 */

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Maximum speed (in km/h) is : " + maxSpeed);
        System.out.println("Fuel type is : " + fuelType);
    }

}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat capacity is : " + seatCapacity);
    }

}

class Truck extends Vehicle {
    int horsepower;

    Truck(int maxSpeed, String fuelType, int horsepower) {
        super(maxSpeed, fuelType);
        this.horsepower = horsepower;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Horsepower ( in hp ) is : " + horsepower );
    }

}

class Motorcycle extends Vehicle {
    String brand;

    Motorcycle(int maxSpeed, String fuelType, String brand) {
        super(maxSpeed, fuelType);
        this.brand = brand;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle brand is : " + brand);
    }
}

class VehicleHierarchy {
    public static void main(String args[]) {
        Vehicle obj1 = new Car(100, "CNG", 4);
        Vehicle obj2 = new Truck(150, "Diesel", 90);
        Vehicle obj3 = new Motorcycle(45, "Petrol", "Platinum");

        Vehicle vehicles[] = { obj1, obj2, obj3 };
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println();
        }

    }

}
