


package Abstraction;

abstract class MobileUser{
    String Name;

    MobileUser(String Name){
        this.Name= Name;
        System.out.println("I am Mobile user abs constructor Name= "+ Name);
    }

    abstract void sendMesseage();

    void display(){
        System.out.println(" I am a test display method non abs");
    }
    void nonAbs(){
        System.out.println(" NON ABS method");
    }
}
abstract class Jamal extends MobileUser {


    Jamal(String Name) {
        super(Name);
    }
}
class Rahim extends MobileUser {
    Rahim(String Name){
        super(Name);
    }

    @Override
    void sendMesseage() {
        System.out.println("I am Rahim using Mobile ");
    }

    @Override
    void display() {
        super.display();
        System.out.println(" I am a display method in Rahim class");
    }
}
class Karim extends MobileUser {
    Karim(String Name){
        super(Name);
    }
    @Override
    void sendMesseage() {
        System.out.println("I am Karim using Mobile ");
    }
    @Override
    void display(){
        System.out.println(" I am a display method in Rahim class");
    }
}
public class H24_AbstractionPractice {
    public static void main(String[] args) {
        MobileUser Abid = new Rahim("Abid");
        MobileUser Rifat = new Karim("Rifat");
        Abid.sendMesseage();
        Rifat.sendMesseage();
        Abid.display();

    }
}



/*
package Crack.Sol.Abstraction;

// Abstract base class
abstract class MobileUser {
    String Name;

    MobileUser(String Name) {
        this.Name = Name;
        System.out.println("I am Mobile user abs constructor Name= " + Name);
    }

    abstract void sendMesseage();

    void display() {
        System.out.println(" I am a test display method non abs");
    }

    void nonAbs() {
        System.out.println(" NON ABS method");
    }
}

// Abstract intermediate class
abstract class Rahim extends MobileUser {
    Rahim(String Name) {
        super(Name);
    }

    @Override
    void sendMesseage() {
        System.out.println("I am Rahim using Mobile ");
    }

    @Override
    void display() {
        super.display();
        System.out.println(" I am a display method in Rahim class");
    }
}

// Concrete subclass
class SubClass extends Rahim {
    SubClass(String Name) {
        super(Name);
    }

    // No need to override sendMesseage or display as they are already implemented in Rahim
}

// Concrete class
class Karim extends MobileUser {
    Karim(String Name) {
        super(Name);
    }

    @Override
    void sendMesseage() {
        System.out.println("I am Karim using Mobile ");
    }

    @Override
    void display() {
        super.display();
        System.out.println(" I am a display method in Karim class");
    }
}

public class H24_AbstractionPractice {
    public static void main(String[] args) {
        Rahim Abid = new SubClass("Abid");
        MobileUser Rifat = new Karim("Rifat");

        Abid.sendMesseage();
        Rifat.sendMesseage();

        Abid.display();
        Rifat.display();
    }
}


 */