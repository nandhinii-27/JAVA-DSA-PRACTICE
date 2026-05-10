import java.util.Scanner;
public class quadrant {
    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and y coordinate:");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("QUADRANT 1");
        }
        else if(x<0 && y>0){
            System.out.println("QUADRANT 2");
        }
        else if(x<0 && y<0){
            System.out.println("QUADRANT 3");
        }
        else if(x>0 && y<0){
            System.out.println("QUADRANT 4");
        }
        else if(x==0 && y==0){
            System.out.println("At the origin");
        }
        else if(x==0 && y!=0){
            System.out.println("Y axis");
        }
        else if(x!=0 && y==0){
            System.out.println("X axis");
        }
    }
}
