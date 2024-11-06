package Arrays;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        //approach 1 ---time complexity O(n) space complexity O(n)

        //approach 2 --time complexity O(n) space complexity O(1)
        int[] arr={1, 2, 3, 4, 5};
        int n=arr.length;
        
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
