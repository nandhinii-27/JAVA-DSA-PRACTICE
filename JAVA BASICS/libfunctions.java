import java.util.Scanner;
public class libfunctions {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.pow(3.14,3.14));
        System.out.println(Math.sqrt(3.14));
        System.out.println(Math.cbrt(3.1415));
        System.out.println(Math.abs(-6));
        System.out.println(Math.floor(-3.14));
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(4.6,0.6));
        int a = 5,b = 8,c = 7;
        System.out.print(Math.max(5,Math.max(b,c)));
    }
}
