import java.util.Scanner;
public class marksarr {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        n = sc.nextInt();
        int [] arr = new int [n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]<35){
                System.out.println(i+1);
            }
        }
    }
}
