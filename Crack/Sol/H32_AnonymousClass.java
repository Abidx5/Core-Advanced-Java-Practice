package Crack.Sol;

class Anonomus{
    void display(){
        System.out.println("Hi ME Abid ");
    }
}


public class H32_AnonymousClass {
    public static void main(String[] args) {
        Anonomus abid = new Anonomus(){
            @Override
            void display() {
                System.out.println("Hi from main method runtime");
            }
        };

        abid.display();
    }

}
