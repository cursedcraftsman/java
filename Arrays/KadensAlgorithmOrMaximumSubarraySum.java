package Arrays;

public class KadensAlgorithmOrMaximumSubarraySum {

    /*Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6. */
 public static void main(String[] args) {
    /*"Keep a running sum of subarray values, reset the sum when it goes negative, and always track the maximum sum seen." */
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    int curr=0;
    int max=0;
    for(int x:nums){
        if(curr<0){
            curr=0;
        }
        curr+=x;
        max=Math.max(max,curr);

    }
    System.out.println(max);

 }
    
}
