package Abstraction;


interface MySampleOne{
    void math1();
    void math2();
}
interface MyChindSample extends MySampleOne {
    void math3();
    void math4();
}

class MyOkTest implements MySampleOne {

    @Override
    public void math1() {
        System.out.println("This is Math1 in my Ok Test class");
    }

    @Override
    public void math2() {
        System.out.println("This is Math2 in my Ok Test class");
    }
}
class MyT1Class implements MyChindSample {


    @Override
    public void math3() {
        System.out.println("This is Math3 in my class");
    }

    @Override
    public void math4() {
        System.out.println("This is Math4 in my class");
    }

    @Override
    public void math1() {
        System.out.println("This is Math1 in my class");
    }

    @Override
    public void math2() {
        System.out.println("This is Math2 in my class");
    }
}
public class H27_InheritanceInInterface {

    public static void main(String[] args) {
        MyT1Class ob1 = new MyT1Class();
        MyOkTest ob2 = new MyOkTest();
        ob1.math1();
        ob2.math2();
    }
}

