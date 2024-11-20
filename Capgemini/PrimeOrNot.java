import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=IsPrime(n);
        if(res){
            System.out.println("prime");

        }
        else{
            System.out.println("not a prime");
        }

        sc.close();
    }
    public static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i=2;i*i<=n;i++){ //Math.sqrt(n)+1
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
