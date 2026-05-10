class Employee1 {
    String name, address, jobtitle;
    double salary;
    double bonus() {
        return 0;
    }
    void performancereport() {
        System.out.println(jobtitle + " performance is good");
    }
    void manageprojects() {
        System.out.println(jobtitle + " manages project");
    }
}
class Manager extends Employee1 {
    Manager(String n, String a, double s) {
        name = n;
        address = a;
        salary = s;
        jobtitle = "Manager";
    }
    double bonus() {
        return salary * 0.15;
    }
}
class Developer extends Employee1 {
    Developer(String n, String a, double s) {
        name = n;
        address = a;
        salary = s;
        jobtitle = "Developer";
    }
    double bonus() {
        return salary * 0.20;
    }
}
class Programmer extends Employee1 {
    Programmer(String n, String a, double s) {
        name = n;
        address = a;
        salary = s;
        jobtitle = "Programmer";
    }
    double bonus() {
        return salary * 0.30;
    }
}
public class Employee1Main {
    public static void main(String[] args) {
        Employee1 m = new Manager("Abc", "Chennai", 80000);
        Employee1 d = new Developer("def", "Bangalore", 60000);
        Employee1 p = new Programmer("ghi", "Mumbai", 50000);
        System.out.println(m.bonus());
        System.out.println(d.bonus());
        System.out.println(p.bonus());
    }
}




