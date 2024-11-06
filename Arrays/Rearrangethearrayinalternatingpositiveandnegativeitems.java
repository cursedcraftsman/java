package Arrays;
import java.util.*;

public class Rearrangethearrayinalternatingpositiveandnegativeitems {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int n=nums.length;
        /*tc-- O(n) sc--O(n), but we are passing agian and again and also 2 arrays creation is not necessary..so next approach is useful */
        
        /*int half=n/2;
        int[] pos=new int[half];
        int[] neg=new int[half];
        int posind=0;
        int negind=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[posind]=nums[i];
                posind++;

            }
            else if(nums[i]<0){
                neg[negind]=nums[i];
                negind++;

            }
        }  
        posind=0;
        negind=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[posind];
                posind++;
            }
            else{
                nums[i]=neg[negind];
                negind++;
            }
        }
        System.out.println(Arrays.toString(nums));*/


         
        int[] b=new int[n];
        int pos=0; //positive zero index
        int neg=1; //negative one index
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                b[neg]=nums[i];
                neg+=2;
            }
            else if(nums[i]>0){
                b[pos]=nums[i];
                pos+=2;
            }
        }
        System.out.println(Arrays.toString(b));
        
    }
    
}
