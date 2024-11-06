package Strings;
import java.util.*;

public class CountNumberOfVowelsAndConsonantsAndspacesInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int vowels=0;
        int conso=0;
        int space=0;
        for(int i=0;i<s.length();i++){
            char word=s.charAt(i);
            if(word=='a' || word=='e'|| word=='i' || word=='o' || word=='u' ){
                vowels+=1;
            }
            else if(word==' '){
                space+=1;

            }
            else{
                conso+=1;
            }
        }
        System.out.println(vowels);
        System.out.println(space);
        System.out.println(conso);
        sc.close();
        
    }
    
}
