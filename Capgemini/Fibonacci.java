import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //fibomacci-- 0,1,1,2,3,5,7,9
                 /*    f[1]=0,
                       f[2]=1,
                       f[3]=1,
                       f[4]2,
                       f[5]3= */
        int a=0;
        int b=1;
        if(n<=0){
            System.out.println(-1);
        }
        else if(n==1){
            System.out.println(a);
        }
        else {
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=2;i<n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
    
            }

        }


        

        sc.close();
        }   
    
    
}
