 
public class MoveHashesToEnd {
    public static void main(String[] args) {
        
        String str="####abcdef##";
        char[] ch=str.toCharArray();
        int n=str.length();

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<n;i++){
            if(ch[i]=='#'){
                s1.append(ch[i]);
            }
            else{
                s2.append(ch[i]);
            }
        }
        System.out.println(s1.append(s2));


    }
}
