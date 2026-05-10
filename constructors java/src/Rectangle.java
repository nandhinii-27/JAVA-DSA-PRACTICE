public class Rectangle {
    double length,width;
    Rectangle(double length,double  width){
        this.length = length;
        this.width = width;
    }
    Rectangle(Rectangle r){
        this.length = r.length;
        this.width = r.width;
    }
    void print(){
        System.out.println(length);
        System.out.println(width);
    }
    public static void main(String [] args){
        Rectangle r = new Rectangle(5.6,7.8);
        Rectangle r1 = new Rectangle(r);
        r.print();
        r1.print();
    }
}
