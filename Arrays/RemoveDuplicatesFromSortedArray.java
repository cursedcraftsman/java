package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        //approach1---hashset timecomplexity-O(n) spacecomplexity-O(n)
        
        int[] nums={1,1,2};
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);  //O(1) //[1,2]
        }
        int j=0;
        for(int x:set){
            nums[j++]=x;
        }
        int k=set.size();
        System.out.println("the size of set is: "+k);
        System.out.println("the array after removing duplicates is: "+Arrays.toString(nums));

        // that you're using a HashSet, which doesn't maintain the original order of the elements.
        // In the problem you're dealing with, it's important to preserve the order of the elements after removing duplicates, 
        //as seen in the expected output.
    
     //-------------------------------------------------------------------------------------------------
     
        //approach2--two pointer approach --timecomplexity O(n),spacecomplexxity O(1)


        int[] arr={0,0,1,1,1,2,2,2};
        int left=1;
        int right=1;
        while (right<arr.length) 
            
        {
            if(arr[right]==arr[right-1]){
                right+=1;

            }
            else{
                arr[left]=arr[right];
                left+=1;
                right+=1;
            }
        }
     
        System.out.println(Arrays.toString(arr));



    }
    
}
