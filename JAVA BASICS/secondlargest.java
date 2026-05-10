import java.util.Scanner;
public class secondlargest {
    public static void main(String [] args){
        int i,n,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max = arr[0];
        for(i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.print("Second largest element is:"+smax);
    }
}
