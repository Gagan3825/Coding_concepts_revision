package Threading;
//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
//by extending the thread
//class mythread extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("value of i is" + i);
//        }
//
//    }
//}


//by implementing the  runnable
class mythread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("printing the value of i :" +i);
            try{
              Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            };
        }

    }
}
public class Multithreading {
    public static void main(String[] args) {
        mythread mythread=new mythread();
        Thread obj=new Thread(mythread);
        obj.start();

    }
}
