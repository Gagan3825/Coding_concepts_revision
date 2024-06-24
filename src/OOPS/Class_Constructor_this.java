package OOPS;

  class Student{
    int id;
    String name;
    float marks;

    //constructors
    Student(){  //default constructor
//        id=0;
//        name="GAGAN";
//        marks=90.4f;
        System.out.println("hello");
    }
    Student(int id,String name,float marks){  //parameter constructor
        this();  //previous constructor calling
        this.id=id;    //if there is ambiguity between the instance variables and parameters, THIS keyword resolves the problem of ambiguity.//reusing the constructor
        this.name=name;
        this.marks=marks;


    }
}
public class Class_Constructor_this {

    public static void main(String[] args) {
//        Student stu=new Student();  //object are the instance of the class
        Student stu2=new Student(10,"Rahul",7.4f);
//        System.out.println(stu.id);
//        System.out.println(stu.name);
//        System.out.println(stu.marks);

        System.out.println(stu2.id);
        System.out.println(stu2.name);
        System.out.println(stu2.marks);
//        new student //means object is created and memeory is located runtime


    }
}
