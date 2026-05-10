import java.util.Scanner;
public class greatestofthree {
    public static void main(String [] args){
        int x,y,z;
        System.out.println("Enter three numbers(X,Y,Z):");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if(x>y && x>z){
            System.out.println("X is greatest");
        }
        else if(y>x && y>z){
            System.out.println("Y is greatest");
        }
        else{
            System.out.println("Z is greatest");
        }
    }
}
