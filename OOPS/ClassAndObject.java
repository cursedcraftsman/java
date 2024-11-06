package OOPS;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");

    }
    public void params(){
        System.out.println(this.color);
    }

}

public class ClassAndObject {
    public static void main(String args[]){
        Pen p1=new Pen();
        Pen p2 =new Pen();
        p1.color="red";
        p2.color="blue";
        p1.params();
        p2.params();






    }
    
}
