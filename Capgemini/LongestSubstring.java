import java.util.*;
public class LongestSubstring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int maxi=0;
       
         for(int r=0;r<str.length();r++)
       {
            char ch=str.charAt(r);
            if(set.contains(ch)){
                set.remove(l);
                l++;

            }
            else{
                set.add(ch);
                maxi=Math.max(maxi,r-l+1);
            }
        }
        System.out.println(maxi);
        sc.close();
    }
    
}
