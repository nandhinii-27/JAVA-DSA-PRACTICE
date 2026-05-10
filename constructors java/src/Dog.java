public class Dog {
    String name,color;
    Dog(String name,String color){
        this.name = name;
        this.color = color;
    }
    public static void main(String [] args){
        Dog obj = new Dog("Shiro","White");
        System.out.println(obj.name);
        System.out.println(obj.color);
    }
}
