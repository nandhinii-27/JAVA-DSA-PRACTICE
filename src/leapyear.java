import java.util.Scanner;
public class leapyear {
    public static void main(String [] args){
        int x;
        System.out.println("enter a year:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if((x%4==0 && x%100!=0) || (x%400 == 0)){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Given year is not leap year");
        }
    }
}
