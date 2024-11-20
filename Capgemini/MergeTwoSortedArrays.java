import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] nums1=new int[n+m];
        int[] nums2=new int[m];

        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            nums2[j]=sc.nextInt();
        }
        int index=n+m-1;
        int i=n-1;
        int j=m-1;
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
        while(j>=0){
            nums1[index--]=nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
        sc.close();
        
    }
    
}
