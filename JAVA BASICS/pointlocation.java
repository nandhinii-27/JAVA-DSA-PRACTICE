import java.util.Scanner;
public class pointlocation {
    public static void main(String[] args){
        int oa,x1,x2,y1,y2,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        r = sc.nextInt();
        System.out.println("Enter x1 and y1:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter x2 and y2:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        oa = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        int rsq;
        rsq = r*r;
        if(oa>rsq){
            System.out.println("Point is outside the circle");
        }
        else if(rsq>oa){
            System.out.println("Point is inside the circle");
        }
        else{
            System.out.println("Point is on the circle");
        }

    }
}
