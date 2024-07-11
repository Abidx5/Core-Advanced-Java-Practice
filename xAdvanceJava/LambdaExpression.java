package xAdvanceJava;
interface Lamb{
    void test1();

}
interface Lamb2{
    void test2(int a);
}

interface Lamb3{
    void test3(String Name, int Age);
}

class LambClass implements  Lamb{

    @Override
    public void test1() {
        System.out.println("normal class method override");
    }
}


public class LambdaExpression {
    public static void main(String[] args) {
        Lamb ob = new LambClass();
        ob.test1();

        // But for only one method interface we can use lambda expression;;

        Lamb2 ob2 = (a)->{
            System.out.println("Hi I am Lambda ex with parameter = "+a);
        };
        ob2.test2(10);

        Lamb3 ob3 =  (Name,Age)-> {
            System.out.println("My Name is "+Name+" And my Age is "+Age);
        };
       ob3.test3("Abid",25);
    }
}
