import java.util.*;
public class Frequencyofanumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        //scan the arrayelements
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        //declare hashmap
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>(); //cnumber,count

        //enter elements into hashmap
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1); 

        }

        //iterate throuhj hashmap and print result
        for(Integer keys: map.keySet()){
            System.out.println(keys+" occured "+ map.get(keys));
        }
        sc.close();



    }
}
