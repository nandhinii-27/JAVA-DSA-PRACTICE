import java.util.Scanner;
public class absolutenumber {
    public static void main(String [] args){
        int x;
        System.out.println("enter a number:");
        Scanner sc =  new Scanner(System.in);
        x = sc.nextInt();
        if(x<0){
            x = x*(-1);
            System.out.println("The absolute number is:"+x);
        }
        else{
            System.out.println("The absolute number is:"+x);
        }
    }
}
