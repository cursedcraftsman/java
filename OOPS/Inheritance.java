package OOPS;
class Family{
    public void property(){
        System.out.println("this is grand fathers property");
    }

}

class GrandFather extends Family{
    String diseases;
    public void property(){
        System.out.println("this is grand fathers property");
    }

}
class GrandMother extends Family{
    public void  property(){
        System.out.println("this is grand mothers property");
    }

}
class Father extends GrandFather{
 


}
 

public class Inheritance {
    public static void main(String[] args) {
        Father f=new Father();
        f.property();
     
         

    }
    
}
