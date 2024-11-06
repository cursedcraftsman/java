package Arrays;

 

public class LongestSubarraywithgivenSumKPositives {
    public static void main(String[] args) {

       
        int N=5;
        int K=10;
        int[] A=new int[N];
        A[0]=2;
        A[1]=3;
        A[2]=5;
        A[3]=1;
        A[4]=9;
         
        //bruteforce---two loops--time complexity O(N^2)--space complexity O(1)
        int sum=0;
        int len=0;
        for(int i=0;i<N;i++){
            sum=0;
            for(int j=i;j<N;j++){
                sum=sum+A[j];
                if(sum==K){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);

        //better--two pointers approach 
        
        int l = 0; // Left pointer
        int r = 0; // Right pointer
        
        long sumi = 0; // Current sum
        int currlen = 0; // Length of the current longest subarray

        while (r < N) {
            // Add the current element to the sum
            sumi += A[r];
            r++; // Move the right pointer to the right

            // While sum exceeds k, move the left pointer to reduce the sum
            while (sumi > K && l < r) {
                sumi -= A[l];
                l++;
            }

            // If the sum equals k, update currlen
            if (sumi == K) {
                currlen = Math.max(currlen, r - l); // Update the max length
            }
        }
        
        System.out.println(currlen);


        
    }
    
}
