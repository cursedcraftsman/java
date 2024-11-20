package Strings;

import java.util.Stack;

public class RemoveOutermostParenthesesOrValidParathesisInStriver {
    public static void main(String[] args) {
        //tc: O(n) sc: O(n) 
        String s = "(()())(())";
        int bracket=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char word=s.charAt(i);
            if(word=='('){
                if(bracket>0){
                    res+=word;
                }
                bracket++;
            }
            else{
                bracket--;
                if(bracket>0){
                    res+=word;
                }
            }
        }
       System.out.println(res);

       //stack approach 
        StringBuilder resl=new StringBuilder();
        //why using StringBuilder? 
        /*A String in Java is immutable, meaning once it is created, its value cannot be changed.
                If you try to modify a String (such as appending characters to it), Java creates a new String object every time you modify it.
 */
         Stack<Character> stack=new Stack<>();
                 for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(') {
                if (!stack.isEmpty()) {
                    resl.append(current); // Add to result if it's not the outermost '('
                }
                stack.push(current); // Push '(' to the stack
            } else {
                stack.pop(); // Pop '(' from the stack
                if (!stack.isEmpty()) {
                    resl.append(current); // Add to result if it's not the outermost ')'
                }
            }
        }
        
        System.out.println(res.toString());
    }
}
