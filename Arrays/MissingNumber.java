package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n=nums.length;
        int num=n*(n+1)/2;
        System.out.println(num-sum);
    }
    
}
