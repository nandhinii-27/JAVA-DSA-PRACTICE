class Employee{
    void work(){
        System.out.println("Employee is working");
    }
    void getSalary(){
        System.out.println("Salary is credited");
    }
}
class HRManager{
    void work(){
        System.out.println("Employee is working");
    }
    void addEmployee(){
        System.out.println("New employee is added");
    }
}
public class Salary {
    public static void main(String [] args){
        Employee obj = new Employee();
        HRManager obj2 = new HRManager();
        obj2.addEmployee();
    }
}
