package impletree;

 class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Tree_implement {
Node root;

 static void traverse(Node node){
    if(node==null)return;
    else{
        System.out.println(node.data);
        traverse(node.left);
        traverse(node.right);
    }
}


    public static void main(String[] args) {
      Tree_implement node=new Tree_implement();
      node.root=new Node(1);
      node.root.left=new Node(4);
      node.root.right=new Node(5);

    node.traverse(node.root);

    }
}
