package OOPS.abstraction_interfernce;
// An interface can have another interface which is known as a nested interface.
//  For example:
public interface nested_interfernce {
    interface parent{
        void print();
    }
}

class A implements nested_interfernce.parent{
    @Override
    public void print() {
        System.out.println("heloo i am in nested interferace");
    }
}

class nested{
    public static void main(String[] args) {
        A obj=new A();
        obj.print();
    }
}
