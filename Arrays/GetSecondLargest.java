package Arrays;

public class GetSecondLargest {
    public static void main(String[] args) {
        int[] arr={10,10,10,10,50};
        int n=arr.length;
        if (n==0 || n==1){
            System.out.println(-1);
        }
        int largest=arr[0];
        int second=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]>second && arr[i]!=largest && arr[i]<largest){
                second=arr[i];
            }
            
        }
        System.out.println(second);
  
    }
    
}
