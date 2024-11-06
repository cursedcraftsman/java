package LinkedList;
 
class Node{
    public int data;
    Node next;

}
class LinkedListMethods{
    Node head;

 //-----------------------------------------------------------
 //insert at end of list
    public void insertAtEnd(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        //if the node is first object or not to verify
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;

            }
            n.next=node;

        }

    }

//---------------------------------------------------------------
//insert at beginning
   public void insertAtBegining(int value){
    Node node=new Node();
    node.data=value;
    node.next=null;
    if(head==null){
        head=node;
    }
    else{
        node.next=head;
        head=node;
    }
   }

 
//insert at a given position
   public void insertAtPosition(int position,int value){
    Node node=new Node();
    node.data=value;
    node.next=null;

    if(head==null){
        head=node;
        
    }
    else{
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }

   }

   //------------------------------------- deletion -------------------------------
   public void deleteAtEnding(){
    if(head==null){
        System.out.println("linked list is empty, cant delete");
    }
    else if(head.next==null){
        System.out.println("linked list is empty, cant delete");
       
    }
    else{
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
    }


   }

   public void deleteAtBeginning(){
    if(head==null){
        System.out.println("linked list is empty, cant delete");
    }
    else{
        Node temp=head;
        head=temp.next;
    }

   }

   public void deleteAtPosition(int position){
    if(head==null){
        System.out.println("linked list is empty, cant delete");
    }
    else{
        Node temp=head;
        Node p=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
            p=p.next;
        }
        p=p.next;
        temp.next=p.next;

    }


   }

    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+"-->");
            n=n.next;

        }
        System.out.print(n.data);
    }



}
  public class Runner {
    public static void main(String args[]){
        LinkedListMethods list=new LinkedListMethods();
        list.insertAtEnd(5);
        list.insertAtEnd(15);
        list.insertAtEnd(25);
        list.insertAtEnd(35);
     
        list.deleteAtPosition(2);
   

        list.show();



       
    }

    
}