public class Point {
    double x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Point P1 = new Point(5.66, 7.88);
        Point P2 = new Point(3,4);
        P1.print();
        P2.print();
    }
}


