import java.util.*;
public class StringCompression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

       String str="ccddda";
       StringBuilder s1= new StringBuilder();
       int n=str.length();
       char[] ch=str.toCharArray();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);

        }
        for(Character keys:map.keySet()){
            if(map.get(keys)>1){
                s1.append(keys);
                s1.append(map.get(keys));

            }
            else{
                s1.append(keys);
            }


        };
        System.out.println(s1);
        sc.close();

    }
    
}
