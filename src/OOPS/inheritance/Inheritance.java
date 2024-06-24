package OOPS.inheritance;

class Teacher{
    int rollno=10;
    Teacher(){
        System.out.println("we are learning the inheritance");
    }
    Teacher(int rollno){
        this.rollno=rollno;

    }
}
// this child class
//this is called simple inheritance
class Student extends Teacher{
    String name;
    Student(){
        System.out.println("in the child class");
    }
    Student(String name){
        super(20); //it invokes the parent consturctor in the child constructor
        this.name=name;
    }
}

//multilevel inheritance
//In this class Student1 extends the class Student and class Student extens the class Teacher .It means when super invoked
//for the Student class then also super invoked for the Teacher class as well as
class Student1 extends Student{


   int marks;
   Student1(int value){
       super("Gagan");
       marks=value;
   }


}
public class Inheritance {
    public static void main(String[] args) {
        //simple creating of instance
//        Student obj=new Student();
//
//        System.out.println(obj.rollno);

        //now we use inheritance
//        Student1 obj=new Student("Gagan");
//        System.out.println(obj.rollno);
//        System.out.println(obj.name);

        Student1 obj=new Student1(100);
        System.out.println(obj.rollno);
        System.out.println(obj.name);
        System.out.println(obj.marks);



    }
}
