import java.util.Scanner;
public class search {
    public static void main(String [] args){
        int n,i,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array:");
        n = sc.nextInt();
        System.out.print("Enter search element:");
        x = sc.nextInt();
        int [] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]==x){
                System.out.print("Element "+x+" at index "+(i+1));
            }
        }
    }
}
