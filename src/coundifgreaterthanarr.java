import java.util.Scanner;
public class coundifgreaterthanarr {
    public static void main(String [] args){
        int i,n,x,count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter x:");
        x = sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.print(count);
    }
}
