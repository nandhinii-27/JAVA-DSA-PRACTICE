import java.util.Scanner;
public class grading {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark:");
        x=sc.nextInt();
        if(x>90){
            System.out.println("A grade");
        }
        else if(x>80){
            System.out.println("B grade");
        }
        else if(x>70){
            System.out.println("C grade");
        }
        else if(x>60){
            System.out.println("D grade");
        }
        else if(x>50){
            System.out.println("E grade");
        }
        else{
            System.out.println("F grade");
        }
    }
}
