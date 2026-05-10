public class Vehicle1 {
    String make;
    String model;
    int year;
    String fuelType;
    double fuelEfficiency() {
        return 0;
    }
    double distanceTraveled() {
        return 100;
    }
    double maxSpeed() {
        return 0;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "Toyota";
        c.model = "Camry";
        c.year = 2022;
        c.fuelType = "Petrol";
        System.out.println(c.distanceTraveled());
        System.out.println(c.maxSpeed());
    }
}
class Truck extends Vehicle1{
    double fuelEfficiency() {
        return 6.0;
    }
    double maxSpeed() {
        return 120;
    }
}
class Car extends Vehicle1{
    double fuelEfficiency() {
        return 15.0;
    }
    double maxSpeed() {
        return 180;
    }
}
class Motorcycle extends Vehicle1{
    double fuelEfficiency() {
        return 25.0;
    }
    double maxSpeed() {
        return 200;
    }
}
