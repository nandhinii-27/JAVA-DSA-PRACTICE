class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Catt extends Animal{
    void makeSound(){
        System.out.println("Cat barks");
    }
}
public class Animals{
    public static void main(String [] args){
        Animal obj1 = new Animal();
        Catt obj2 = new Catt();
        obj2.makeSound();
        obj1.makeSound();
    }
}

