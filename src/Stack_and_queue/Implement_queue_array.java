package Stack_and_queue;

class queue{
    int arr[];
    int start,end,currsize,maxsize;
    queue(){
        arr=new int[15];
        start=-1;
        end=-1;
        currsize=0;
    }

    queue(int maxsize){
        this.maxsize=maxsize;
        arr=new int[maxsize];
        start=-1;
        end=-1;
        currsize=0;
    }
    void push(int x){
        if(currsize==maxsize){
            System.out.println("queue is full");
            System.exit(1);
        }
        if(end==-1){
            start=0;
            end=0;
        }else{
            end=(end+1)%maxsize;
            arr[end]=x;
            System.out.println("the ele is pushed");
            currsize++;
        }
    }

    int pop(){
        if(start==-1){
            System.out.println("queue is empty");
            System.exit(1);
        }
        int poped=arr[start];
        if(currsize==1){
            start=-1;
            end=-1;
        }else{
            start=(start+1)%maxsize;

        }
        currsize--;
        return poped;
    }
    int top(){
        if(start==-1){
            System.out.println("queue is empty");
            System.exit(1);
        }
        return arr[start];
    }
    int size(){
        return currsize;
    }
}
public class Implement_queue_array {
    public static void main(String[] args) {
        queue queue=new queue(6);
        queue.push(4);
        queue.push(14);
        queue.push(26);
        queue.push(34);
        System.out.println("The peek of the queue before deleting any element " + queue.top());
        System.out.println("The size of the queue before deletion " + queue.size());
        System.out.println("The first element to be deleted " + queue.pop());
        System.out.println("The peek of the queue after deleting an element " + queue.top());
        System.out.println("The size of the queue after deleting an element " + queue.size());
    }
}
