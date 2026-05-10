import java.util.Scanner;
public class atobdivisibility {
    public static void main(String [] args){
        int i,a,b;
        System.out.println("enter a and b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Numbers divisible by 3 are:");
        for(i=a;i<=b;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
