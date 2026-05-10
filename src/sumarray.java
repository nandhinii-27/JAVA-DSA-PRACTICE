import java.util.Scanner;
public class sumarray {
    public static void main(String [] args){
        int i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in array:");
        n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.print("Sum is:"+sum);
    }
}
