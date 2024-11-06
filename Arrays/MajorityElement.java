package Arrays;

 
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums={1,2,3,1,3,3,3,3};

        //hashmap method sc=O(n) tc=O()
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        int majority=nums.length/2;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>majority){
               System.out.println(entry.getKey());
            }
        }
         
        //sorting method 
        Arrays.sort(nums);
        System.out.println(nums[majority]);
    }
    
}
