package Arrays;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] a={2, 2, 3, 4, 5};
        int[] b={1, 1, 2, 3, 4};
       HashSet<Integer> set=new HashSet<>();
       // TreeSet<Integer> set =new TreeSet<>();  //tree set is another collection data structure which gives sorted order elements .
        /*Performance:

    HashSet: Constant-time performance for add, remove, and contains operations (O(1)).
    TreeSet: Logarithmic time (O(log n)) for add, remove, and contains because it is backed by a TreeMap (which is a Red-Black Tree). */
        for(int x:a){
            if(!set.contains(x)){
                set.add(x);
            }
        }
        for(int x:b){
            if(!set.contains(x)){
                set.add(x);
            }
        }
        System.out.println(set);

         

    }
    
}
