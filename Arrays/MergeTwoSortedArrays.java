package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
      //  int[] a={1,2,3,0,0,0};
       // int b[] ={2,5,6};
       // int m=3;
       // int n=b.length;

        //method 1 by using merge techinqe of merge sort. space complxity O(n+m)---- time complexity O(m+n)

       /*  int c[]=new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                c[index]=a[i];
                index++;
                i++;

            }
            else{
                c[index]=b[j];
                index++;
                j++;
            }
        }
        while (i < m) {
            c[index++] = a[i++];
        }

        // Copy remaining elements of b, if any
        while (j < n) {
            c[index++] = b[j++];
        }

        System.out.println(Arrays.toString(c));*/

        int[] nums1={1,2,3,0,0,0};
        int nums2[] ={2,5,6};
        int m=3;
        int n=nums2.length;
        int index=n+m-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[index]=nums1[i];
                i--;
                index--;
            }
            else{
                nums1[index]=nums2[j];
                j--;
                index--;
            }
        }
 
        
        while (j >=0) {
            nums1[index--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
        

        
    }
}
