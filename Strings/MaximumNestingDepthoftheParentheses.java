package Strings;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {
        /*
        Intuition
        First of all, forget the numbers. They are distractions Xd
        I like to think of this problem like a maze.
        Imagine entering a room when you encounter a ( (opening door).
        As You are a calculative person, you would like to keep track how far in you have reached.
        Think of Level 0 when you arent any room. As you move in (encounter a () you know you are inner than the previous Level. So you increment the local depth. You do this whenever you encounter a (.
        Now you exit a level when you open the door ). Now you check if the depth you recorded is greater than the maximum depth recorded. Update it accordingly.
        
        Approach
            Convert above story to Code :)

        Complexity
            Time complexity:O(n)

        Space complexity:O(n)
         */
        
        String s="(1+(2*3)+((8)/4))+1";
        int depth=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            char w=s.charAt(i);
            if(w=='('){
                depth++;
               
            }
            else if(w==')'){
                depth--;
            }
            maxdepth=Math.max(maxdepth,depth);
            
        }
        System.out.println(maxdepth);
    }
}

