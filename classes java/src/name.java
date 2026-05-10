class Person {
    String FirstName;
    String LastName;
    void getFirstName(String FirstName) {
        this.FirstName = FirstName;
        System.out.println(FirstName);
    }
    void getLastName(String LastName) {
        this.LastName = LastName;
        System.out.println(LastName);
    }
}
class Employee2 extends Person {
    double Id;
    String jobtitle;
    void getEmployee2Id(double Id) {
        this.Id = Id;
        System.out.println(Id);
    }
    void getLastName(String LastName,String jobtitle) {
        this.LastName = LastName;
        this.jobtitle = jobtitle;
        System.out.println(LastName + " - " + jobtitle);
    }
}
public class name {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Employee2 obj2 = new Employee2();
        obj1.getFirstName("Nandhini");
        obj1.getLastName(" I ");
        obj2.getEmployee2Id(31);
        obj2.getLastName(" I ","Software Engineer");
    }
}



