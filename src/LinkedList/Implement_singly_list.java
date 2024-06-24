package LinkedList;

 class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class Implement_singly_list {
   private Node head;
   public Implement_singly_list(){
       this.head=null;
   }
    public void append(int val){
        Node newnode=new Node(val);
       if(head==null){
           head=newnode;
       }else{
           Node curr=head;
           while(curr.next!=null){
               curr=curr.next;
           }
           curr.next=newnode;
       }
    }

    void printl(){
       Node curr=head;
       while(curr!=null){
           System.out.println(curr.val + " ");
           curr=curr.next;
       }
    }
    public static void main(String[] args) {
        Implement_singly_list n=new Implement_singly_list();
        n.append(10);
        n.append(20);
        n.append(30);

        n.printl();
    }
}
