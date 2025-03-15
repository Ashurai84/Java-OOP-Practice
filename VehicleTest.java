// Parent Class
class Vehicle {
    void start() {
        System.out.println("This vehicle is amazing!");
    }
}

// Child Class: Car
class Car extends Vehicle {
    void drive() {
        System.out.println("WOW! So smooth for driving.");
    }
}

// Child Class: Bike (Overriding start() Method)
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("This bike starts with a self-start button!");
    }

    void speed() {
        System.out.println("This bike gives a top speed of 300 km/h.");
    }
}

// Child Class: Truck
class Truck extends Vehicle {
    void loadCapacity() {
        System.out.println("This truck can carry a minimum of 500 kg in a single lane.");
    }
    @Override
    void start(){
        System.out.println("This truck starts with a heavy-duty ignition!");
    }
}

// Child Class: ElectricCar (Overriding start() Method)
class ElectricCar extends Car {
    void batteryStatus() {  // Fixed method name
        System.out.println("So this car now has 90% battery.");
    }
}

// Main Class
public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();
        ElectricCar e = new ElectricCar();

        // Car
        c.drive();
        c.start(); // Inherited from Vehicle

        // Bike
        b.speed();
        b.start(); // Overridden method

        // Truck
        t.start(); // Inherited from Vehicle
        t.loadCapacity();

        // ElectricCar
        e.start(); // Inherited from Car
        e.drive();
        e.batteryStatus(); 
    }
}
