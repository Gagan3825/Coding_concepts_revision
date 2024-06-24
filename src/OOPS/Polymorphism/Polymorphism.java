package OOPS.Polymorphism;
//compile time polymorphism/early binding/static.It is also known as static polymorphism.
// This type of polymorphism is achieved by function overloading or operator overloading.
//function overloading means When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
// Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.
class Shapes{

    void display(){
        System.out.println("I am in shapes");
    }
//overloading
//    void display(int p1,int p2){
//        System.out.println(p1*p2);
//    }
//
//    void display(int p1,int p2,int p3){
//        System.out.println(p1*p2*p3);
//    }

}
//class Square extends Shapes{
//
//}

//method oveeririding
//Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
//
//In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.
//
//Let's first understand the upcasting before Runtime Polymorphism.
class Square extends Shapes{
    @Override
    void display(){
        System.out.println("Area is square of side");
    }
}

class Triangle extends Shapes{
    @Override
    void display() {
        System.out.println("Area is 0.5 * h * b");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
//        Shapes obj=new Shapes();
//        obj.display();
//        obj.display(5,4);
//        obj.display(5,4,3);

        Shapes obj=new Shapes();
        Shapes obj1=new Square();
        Shapes obj2=new Triangle();
//        Square obj1 = new Square();
        obj.display();
        obj1.display();
        obj2.display();
    }
}
