package Arrays;
import java.util.*;

public class SortingTheArray {
    public static void main(String[] args) {
        int[] x=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            x[i]=sc.nextInt();

        }
        Arrays.sort(x);
        System.out.println(x);
        System.out.println(Arrays.toString(x));
        sc.close();

    }
}
