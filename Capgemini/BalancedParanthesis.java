import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
     
        char[] ch=s.toCharArray();
        boolean ans=isValid(ch);
        if(ans){
            System.out.println("valid");

        }
        else{
            System.out.println("invalid");
        }
    }
    static boolean isValid(char[] ch){
        Stack<Character> st=new Stack<>();
        for(char c:ch){
            if(c =='[' || c=='(' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if((c==')' && top!='(') ||
                (c==']' && top!='[') ||
                (c=='}' && top!='{')
                     
                ){
                    return false;
                }
            }

        }
         return st.isEmpty();

    }
    
}
