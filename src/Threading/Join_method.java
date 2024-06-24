package Threading;
//When the join() method is invoked, the current thread stops its execution and go into the wait state.
// The current thread remains in the wait state until the thread on which the join() method is invoked called is dead
public class Join_method extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
            try{
                Thread.sleep(300);
                System.out.println("current thread name" + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Join_method obj1=new Join_method();
        Join_method obj2=new Join_method();
        Join_method obj3=new Join_method();

        obj1.start();
        try{
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            obj1.join();
        }catch(Exception e)
        {
            System.out.println("The exception has been caught " + e);
        }
        obj2.start();
        try{
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            obj2.join();

        }catch(Exception e)
        {
            System.out.println("The exception has been caught " + e);
        }
        obj3.start();


    }
}
