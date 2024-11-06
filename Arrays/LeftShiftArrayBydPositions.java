package Arrays;
import java.util.Arrays;

public class LeftShiftArrayBydPositions {
    public static void main(String args[]){
        int[] x={10,20,30,40,50};
        int d=3;
        int n=x.length;
        for(int i=0;i<d;i++){
            int temp=x[0];
            for(int j=1;j<n;j++){
                x[j-1]=x[j];
            }
            x[n-1]=temp;
        }
 
        System.out.println(Arrays.toString(x));


   
    }
    
}
