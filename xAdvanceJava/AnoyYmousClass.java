package xAdvanceJava;
interface Anonmous{
    void math1();
    void math2();
}

/*class MathTest implements Anonmous{
    @Override
    public void math1() {
        System.out.println("Hi i am math1");
    }

    @Override
    public void math2() {
    }
}
*/

public class AnoyYmousClass {
    public static void main(String[] args) {
        //MathTest ob = new MathTest();
        Anonmous ob = new Anonmous() {
            @Override
            public void math1() {
                System.out.println("I am from an anonymous Class");
            }

            @Override
            public void math2() {

            }
        };
        ob.math1();
    }
}
