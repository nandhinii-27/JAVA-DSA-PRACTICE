class Animal1 {
    void move() {
        System.out.println("Animal moves");
    }
}
class Cheetah extends Animal1 {
    void move() {
        System.out.println("Cheetah runs");
    }
}
public class ques6 {
    public static void main(String[] args) {
        Animal1 obj = new Cheetah();
        obj.move();
    }
}



