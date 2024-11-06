package Arrays;
import java.util.*;
public class SortingArraysOf0s1sand2s {
    public static void main(String args[]){

        //sorting array of 0s 1s 2s better approach--tc O(n) 
        int[] nums={0,1,2,1,2};

        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                one+=1;
            }
            else if(nums[i]==2){
                two+=1;
            }
            else{
                zero+=1;

            }
        }
        int index = 0;
       
        for (int j = 0; j < zero; j++) {
            nums[index++] = 0;
        }
        
        
        for (int j = 0; j < one; j++) {
            nums[index++] = 1;
        }
        
       
        for (int j = 0; j < two; j++) {
            nums[index++] = 2;
        }
        System.out.println(Arrays.toString(nums));

        //dutch national flag approCH-- tc O(N)
        int low=0;
        int middle=0;
        int high=nums.length-1;
        while(middle<=high){
           if(nums[middle]==2){
               int temp=nums[high];
               nums[high]=nums[middle];
               nums[middle]=temp;
               high--;

           }
           else if(nums[middle]==1){
               middle++;
           }
           else{
               int temp=nums[low];
               nums[low]=nums[middle];
               nums[middle]=temp;
               low++;
               middle++;
           }
        }
        System.out.println(Arrays.toString(nums));
    

        
}

    }
    

