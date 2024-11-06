package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,5,9,16,5};
        int N=arr.length;
        int K=19;
        int flag=0;
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                 flag=1;
                 break;
            }
          
        }
        System.out.println(flag);
    }
    
}
