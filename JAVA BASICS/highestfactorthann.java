import java.util.Scanner;
public class highestfactorthann {
    public static void main(String [] args){
        int hf,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n = sc.nextInt();
        hf =1;
        for(i=n-1;i>=1;i--){
            if(n%i==0){
                hf = i;
                break;
            }
        }
        System.out.print("Highest factor othern than itself is:"+hf);
    }
}
