import java.util.Scanner;
public class maxarr {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Maximum:"+max);
    }
}
