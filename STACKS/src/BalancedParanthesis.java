import java.util.Scanner;
import java.util.Stack;
public class BalancedParanthesis {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(isBalanced(input)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
        sc.close();
    }
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top,ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (st.size()==0);
    }
    static boolean sameStyle(char top,char ch){
        if(top=='(' && ch==')') return true;
        if(top=='{' && ch=='}') return true;
        if(top=='[' && ch==']') return true;
        return false;
    }
}
