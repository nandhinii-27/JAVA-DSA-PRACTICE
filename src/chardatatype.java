import java.util.Scanner;
public class chardatatype {
    public static void main(String [] args){
        char ch;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        ch = sc.next().charAt(0);
        System.out.println(ch);
        x = (int) ch;
        System.out.print("The ascii value is:"+x);
    }
}
