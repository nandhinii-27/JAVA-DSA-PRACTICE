import java.util.Scanner;
public class profitloss {
    public static void main(String [] args){
        float cp,sp,loss,profit;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cp and sp:");
        cp = sc.nextFloat();
        sp = sc.nextFloat();
        if(cp>sp){
            loss=cp-sp;
            System.out.println("ITS A LOSS OF "+loss);
        }
        else if(sp>cp){
            profit = sp - cp;
            System.out.println("ITS A PROFIT OF "+profit);
        }
        else{
            System.out.println("No profit or loss");
        }
    }
}
