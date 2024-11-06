package Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int n=nums.length;
        int r=1;
        int l=0;
      
        int max=0;

        while(r<n){
           if(nums[l]<nums[r]){
              int profit=nums[r]-nums[l];
              max=Math.max(max,profit);

           }
           else{
               l=r;
               
           }
          
        
            r=r+1;




        }
        System.out.println(max);
        /* 
        int n=nums.length;
        int r=1;
        int l=0;
        int profit=0;
        int max=0;

        while(r<n){
            profit=nums[r]-nums[l];
            if(profit<0){
                l=r;
                 
             
            }
            max=Math.max(max,profit);
            r=r+1;




        }
        System.out.println(max);*/
        


    }
    
}
