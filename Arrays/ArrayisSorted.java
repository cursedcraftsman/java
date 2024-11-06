package Arrays;

public class ArrayisSorted {
    public static void main(String[] args) {
        
    
    int[] nums={10,30,40,20,50};
    int n=nums.length;
        boolean ans=true;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                ans=false;
                break;

            }

        }
        System.out.println(ans);
        
    }
}
