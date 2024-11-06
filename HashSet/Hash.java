package HashSet;

import java.util.HashSet;
import java.util.Iterator;
 
public class Hash {
    public static void main(String[] args) {

        //creation of hashset
        HashSet<Integer> set =new HashSet<>();

        //adding elements in hashset---O(1)----methodname hashsetname.add(element)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);


        //size of hashset--method hashsetname.size()
        System.out.println(set.size());



        //searching element in hashset---O(1)---method name hashsetname.contains(element)
        if(set.contains(2)){
            System.out.println("set containsssssssss element 2");
        }

        //printing entire hashset
        System.out.println(set);

        //deleting element in hashset---O(1)--method name hashsetname.remove(element)
        set.remove(1);
        if(set.contains(1)){
            System.out.println("set contains element 1");
        }
        else{
            System.out.println("set dosent contain element 1");
        }

        // to iterate we use iterator 
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){ //hasnext will give true if there is next value in set else it gives false
            System.out.println(it.next()); //next will return the next value in the list, it may be random also 

        }

       

        //to remove all elements use hashsetname.removeAll()
        set.removeAll(set);
        System.out.println(set);




    
    }
    
}
