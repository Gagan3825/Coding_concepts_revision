package OOPS.abstraction_interfernce;
//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
//In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
class childclass implements Superclass,Interface_practice{
    @Override
    public void dislpay() {
        System.out.println("display from superclass");
    }

    @Override
    public void display() {
        System.out.println("display from interface_practice");
    }
}

public class Main {


    public static void main(String[] args) {
        childclass obj=new childclass();

        obj.dislpay();
        obj.dislpay();
    }
}
