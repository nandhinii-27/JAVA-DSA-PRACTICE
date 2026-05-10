class Rectangle1 extends Shape {
    double length, breadth;
    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}
public class Shape {
    public double getArea() {
        return 0;
    }
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(10, 5);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
