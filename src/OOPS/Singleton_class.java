package OOPS;

public class Singleton_class {
    //In object-oriented programming, a java singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Java Singleton classes, the new variable also points to the first instance created.
    // So whatever modifications we do to any variable inside the class through any instance, affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.

    private static Singleton_class single_instance=null;
    public String s;

    private Singleton_class(){
        s="hello i am singlton class";
    }
    public static synchronized Singleton_class getInstance(){
        if(single_instance==null){
            single_instance=new Singleton_class();
        }
        return single_instance;
    }
    public static void main(String[] args) {
     Singleton_class a= Singleton_class.getInstance();
     Singleton_class b= Singleton_class.getInstance();
     Singleton_class c= Singleton_class.getInstance();

        System.out.println("Hashcode of a" + a.hashCode());
        System.out.println("Hashcode of b" + b.hashCode());
        System.out.println("Hashcode of c" + c.hashCode());

    }
}
