package Arrays;

import java.util.HashMap;

public class TwoSumUnsortedArrayReturningIndices {
    public static void main(String[] args) {
        int[] nums={1, 4, 45, 6, 10, 8};

        //brute force solution O(n^2) time complexity 
        int target=16;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
          
           for(int j=i+1;j<n;j++){
             sum=nums[i]+nums[j];
                if(sum==target){
                  System.out.println("The ith index is: "+i+" "+"The jth index is:"+j);
                  break;
            }

           }

        }

        //Using HashMap tc- O(n) sc- O(n)
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
               
               System.out.println(i+" "+map.get(diff));
            }
            else{
                map.put(nums[i],i);
            }

        }

         

       
      
    }
    
}
