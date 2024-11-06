package Arrays;

public class NumberThatAppearsOnceRestTwicw {
    public static void main(String[] args) {

        //Approach 1 --brute force-- complexity O(n*n)--used technique is linear search
        int[] nums={4, 1, 2, 1, 2};
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
                
            }
            if(count>=2){
                count=0;
            }
            else if(count==1){
                System.out.println(nums[i]);
                break;
            }
        }


        //Approach 2---optimal--using XOR Operator complexity time: O(N) space complexity O(1)
        /* Two important properties of XOR are the following:

        XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
        XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
            Here all the numbers except the single number appear twice and so will form a pair.
            Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property
         1. The result will be = 0 ^ (single number) = single number (according to property 2).
         So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number. */

         int ans=0;
         for(int i=0;i<n;i++){
             ans=ans^nums[i];
 
 
                  
         }
         System.out.println(ans);
      
    }
    
    
 
}
