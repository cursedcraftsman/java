package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int N=arr.length;
        int K=40;
         // Your code here
         int low=0;
         int high=N-1;
         int flag=0;
        
         while(low<=high){
              int mid=(low+high)/2;
             if(arr[mid]==K){
                flag=1;
                break;
             }
             else if(arr[mid]<K){
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
        System.out.println(flag);
  
    }
    
}
