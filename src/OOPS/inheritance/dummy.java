package OOPS.inheritance;
class example{
    int a;
    example(){
        System.out.println("parent constructor");
    }
    example(int a){
        this.a=a;
    }
}
class childexample extends example{
    childexample(){
        System.out.println("i am in child constructor");
    }
}
public class dummy {
    public static void main(String[] args) {
//        example obj=new example();
        childexample obj2=new childexample();

    }
}
