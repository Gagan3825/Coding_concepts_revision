package LinkedList;

public class Doubly_list {
    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    private Node head;

    void insert(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        if(head!=null){
            head.prev=newnode;
        }
        head=newnode;
    }

     Node find(int val){
        Node n=head;
        while(n!=null){
            if(n.val==val){
                return n;
            }
            n=n.next;
        }
        return null;
     }

    void addmiddle(int val,int ind){
        Node prev=find(ind);
        if(prev==null){
            return;
        }
        Node newnode=new Node(val);
        newnode.next=prev.next;
        prev.next=newnode;
        newnode.prev=prev;
        if(newnode.next!=null)
        newnode.next.prev=newnode;
    }
    void printl(){
        //forward
        Node curr=head;
        Node tail=null;
        while(curr!=null){
            System.out.print(curr.val+"->");
            tail=curr;
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println(" ");
        while(tail!=null){
            System.out.print(tail.val+"->");

            tail=tail.prev;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        Doubly_list obj=new Doubly_list();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.addmiddle(15,20);

        obj.printl();
    }
}
