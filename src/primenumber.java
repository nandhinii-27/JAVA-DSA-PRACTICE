import java.util.Scanner;
public class primenumber {
    public static void main(String [] args){
        int n,i;
        System.out.print("enter n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean flag = false;
        for(i=2;i<=n-1;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.println("It is a composite number");
        }
        else{
            System.out.println("It is a prime number");
        }
    }
}
