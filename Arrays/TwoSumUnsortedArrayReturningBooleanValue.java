package Arrays;

import java.util.*;


public class TwoSumUnsortedArrayReturningBooleanValue {
    public static void main(String[] args) {
        /*Input: arr[] = [1, 4, 45, 6, 10, 8], target =16
          Output: true
          Explanation: arr[3] + arr[4] = 6 + 10 = 16 */
          int[] arr={1, 4, 45, 6, 10, 8};
          int target=16;
        
           HashSet<Integer> set=new HashSet<>();
           for(int i=0;i<arr.length;i++){
            int dif=target-arr[i];
            if(set.contains(dif)){
                System.out.println(true);

            }
            else{
                set.add(arr[i]);
            }
        }
        System.out.println(false);


        //using sorting and binary search 
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=arr[low]+arr[high];
            if(mid==target){
                 System.out.println("true");
                 break;
            }
            else if(mid<target){
                low=low+1;
            }
            else if(mid>target){
                high=high-1;
            }
        }


    }
    
}
