package Abstraction;


interface NewInterface{
    void display();
    void setData(String Name, int Age);

}

interface SecondInterface{
    void display();
    void sendMgs();
}
abstract class MrClass implements NewInterface {

}
class TestMan implements NewInterface {

    String Name;
    int Age;
    @Override
    public void display() {
        System.out.println("Name = "+Name+" Age = "+ Age);
    }

    @Override
    public void setData(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;

    }
}
//         if we inherite 2 class that is a problem
class TestClass implements NewInterface, SecondInterface {

    @Override
    public void display() {

    }

    @Override
    public void sendMgs() {

    }

    @Override
    public void setData(String Name, int Age) {

    }
}
public class H25_Interface {
    public static void main(String[] args) {
        TestMan Abid = new TestMan();
        Abid.setData("Abid",25);
        Abid.display();
        //TClass Rifat = new TClass();
        // Rifat.
    }

}





