package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        //approach 1--bruteforce--timecomplexity O(n) spacecomplexity--O(n)
        int[] nums={0,1,0,3,12};
        
        /* 
        int[] arr=new int[n];
        int zero=0;
        int k=0;
         
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr[k++] = nums[i];  // Place non-zero element and increment k
            }
        }
        for(int i=k;i<zero;i++){
            arr[i]=0;
        }
       System.out.println(Arrays.toString(arr));
       */

    //-----------------------------------------------------------------------------------------------------

    //approach2 optimal time complexity O(n) space complexity O(1)
    int l=0;
    int r=0;
    while(r<nums.length){
        if(nums[r]==0){
            r+=1;
        }
        else{
            int temp;
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            r+=1;
            l+=1;
        }
    }
    System.out.println(Arrays.toString(nums));

    }
    
}
