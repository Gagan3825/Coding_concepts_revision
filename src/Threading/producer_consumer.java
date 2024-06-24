package Threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

class producer implements Runnable{
    BlockingQueue<String> queue=null;
    producer(BlockingQueue queue){
        super();
        this.queue=queue;
    }

    @Override
    public void run() {
        try{
            System.out.println("producing element 1");
            queue.put("Element 1");
            Thread.sleep(1000);
            System.out.println("producing element 2");
            queue.put("Element 2");
            Thread.sleep(1000);
            System.out.println("producing element 3");
            queue.put("Element 3");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class consumer implements Runnable{
    BlockingQueue<String> queue=null;
    consumer(BlockingQueue queue){
        super();
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("consumed" + queue.take());
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

public class producer_consumer {
    public static void main(String[] args) {

        BlockingQueue<String> queue=new ArrayBlockingQueue<>(5);
        producer p=new producer(queue);
        consumer q=new consumer(queue);

        Thread obj1=new Thread(p);
        Thread obj2=new Thread(q);

        obj1.start();
        obj2.start();

    }
}
