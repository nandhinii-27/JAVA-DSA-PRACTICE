public class Car {
    String make,model;
    int year;
    Car(){
        make = "Honda";
        model = "Amaze";
        year = 2021;
    }
    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void print(){
        System.out.println(make+" "+model+" "+year);
    }
    public static void main(String [] args){
        Car c1 = new Car("HONDA","ALTO",2020);
        c1.print();
        Car c2 = new Car();
        c2.print();
    }
}
