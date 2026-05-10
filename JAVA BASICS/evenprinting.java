import java.util.Scanner;
public class evenprinting {
    public static void main(String[] args){
        int i;
        System.out.println("even numbers are:");
        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
