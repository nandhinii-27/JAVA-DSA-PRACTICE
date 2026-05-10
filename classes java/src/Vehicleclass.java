class Vehicle{
    void drive(){
        System.out.println("vehicle class----drive");
    }
}
class Carr extends Vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class Vehicleclass {
    public static void main(String [] args){
        Carr obj = new Carr();
        obj.drive();
    }
}

