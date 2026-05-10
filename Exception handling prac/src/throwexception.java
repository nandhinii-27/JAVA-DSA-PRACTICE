import java.util.Scanner;
public class throwexception {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        try{
            age = sc.nextInt();
           if(age<0){
               throw new Exception("Age shld be greater than 1");
           }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
