package InheriTancePack;

import java.security.PublicKey;

class A{
   public A(){
        System.out.println("A constructor");
    }
   int x=2;
    void display(){
        System.out.println(x);
       // System.out.println(super.x);
    }
}
class B extends A{
    public B(){
        // super(); if perameteraised constructor
        System.out.println("B constructor");
    }

      int x=5;

     @Override
     void display(){
         super.display(); //override methods
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class H20_Inheritance_SuperClass {
    public static void main(String[] args) {
        B ob= new B();
        ob.display();
    }
}
