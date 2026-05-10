class Shape2 {
    double getPerimeter() {
        return 0;
    }
    double getArea() {
        return 0;
    }
}
class Circle extends Shape2 {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getPerimeter() {
        return 2 * 3.1415 * radius;
    }
    double getArea() {
        return 3.1415 * radius * radius;
    }
}
public class ques8 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}


