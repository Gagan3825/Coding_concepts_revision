package OOPS.abstraction_interfernce;
//A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
// It needs to be extended and its method implemented. It cannot be instantiated

//Points to Remember
//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.

 abstract class Parent{
     static int a=10;
    abstract void carrier();
}
class child extends Parent{

    @Override
    void carrier() {
        System.out.println("I want to be a doctor");
    }
}
class child2 extends Parent{

    @Override
    void carrier() {
        System.out.println("I want to be an engineer");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        System.out.println(Parent.a);
         child obj=new child();
         child2 obj1=new child2();

         obj.carrier();
         obj1.carrier();

    }
}
