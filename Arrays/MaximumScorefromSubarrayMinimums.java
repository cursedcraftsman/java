package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumScorefromSubarrayMinimums {
    /*The problem asks you to find the maximum score possible from the subarrays of the given array arr[]
     * Score of a Subarray:
    For each subarray from i to j, find the smallest and second smallest numbers within that subarray.
    The score of that subarray is the sum of these two numbers (smallest + second smallest).
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        int maxi=0;
        for(int i=1;i<arr.size();i++){
            int sum = arr.get(i - 1) + arr.get(i);
            // Update maximum if the current sum is greater
            maxi = Math.max(maxi, sum);
            
        }
        System.out.println(maxi);
        
    }
 
  
    /*Example Walkthrough
For the input list arr = [4, 3, 1, 5, 6], here’s how the code works step-by-step:

Initial values: maxi = 0

Loop:

i = 1:
Pair: [4, 3], sum = 4 + 3 = 7
maxi = Math.max(0, 7) = 7
i = 2:
Pair: [3, 1], sum = 3 + 1 = 4
maxi = Math.max(7, 4) = 7 (no update needed)
i = 3:
Pair: [1, 5], sum = 1 + 5 = 6
maxi = Math.max(7, 6) = 7 (no update needed)
i = 4:
Pair: [5, 6], sum = 5 + 6 = 11
maxi = Math.max(7, 11) = 11
Result:

The loop finishes, and maxi holds the value 11, which is the maximum sum of any consecutive pair in the list. This is returned as the result.
Thus, the maximum sum of consecutive pairs in [4, 3, 1, 5, 6] is 11, achieved by the pair [5, 6]. */
}
