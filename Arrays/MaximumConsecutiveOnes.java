package Arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int currmax=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
                currmax=Math.max(currmax,count);

            }
            else{
                count=0;
            }

        }
        System.out.println(currmax);

    }
    
}
