package OOPS;
//Program of the counter without static variable
//In this example, we have created an instance variable named count which is incremented in the constructor. Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable.
// If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.
//class Count{
//    int count=0;
//    Count(){
//        count++;
//        System.out.println(count);
//    }
//}

//Program of counter by static variable
//As we have mentioned above, static variable will get
// the memory only once, if any object changes the value of the static variable, it will retain its value.
//class Count{
//    static int count=0;
//    Count(){
//        count++;
//        System.out.println(count);
//    }
//}


//2) Java static method
//        If you apply static keyword with any method, it is known as static method.
//
//        A static method belongs to the class rather than the object of a class.
//        A static method can be invoked without the need for creating an instance of a class.
//        A static method can access static data member and can change the value of it.

class Student1{
    int a;
    static void display(){
        System.out.println("you are in static method");
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        //static class cant access the non static function or members
//        display()   this is non  static  function
//        //for accessing the non static function we have to make the object of the class
//        Static_keyword obj=new Static_keyword();
//         obj.dispaly();

//        Count obj=new Count();
//        Count obj1=new Count();

//        Student1.display();



    }
//    void dispaly(){
//        System.out.println("hello world");
//    }
}
