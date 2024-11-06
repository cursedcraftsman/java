package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        
      
        int largest=arr[0];
        for(int ele :arr){
            if (ele>largest){
                largest=ele;
            }
        }
        System.out.println(largest);
    }
    
}
