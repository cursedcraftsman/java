package OOPS;
class Add{
    public void addition(int a,int b){
        System.out.println("the addition of 2 integers is:" + " "+(a+b));
    }
    public void addition(int a,int b,int c){
        System.out.println("the addition of 3 integers is:" + " "+(a+b+c));
    }
    public void addition(double a,double b){
        System.out.println("the addition of 2 float is:" + " "+(a+b));
    }


}

public class Polymorphism {
    public static void main(String args[]){
        Add a1=new Add();
        a1.addition(5,10);
      
        a1.addition(5,10,15);
        a1.addition(2.5,4.5);

    }
    
}
