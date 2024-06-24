package Stack_and_queue;

class Stack{
    int arr[] = new int[10];
    int top=-1;
    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int ans=arr[top];
        top--;
        return ans;
    }
    int peek(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}
public class Implement_stack_array {
    public static void main(String[] args) {
       Stack sc=new Stack();
       sc.push(6);
       sc.push(3);
       sc.push(7);

        System.out.println("first element is like:" + sc.pop());
        System.out.println("top element is like:" + sc.peek());
        System.out.println("size is like:" + sc.size());

    }
}
