package Package.Animal1;

import Package.Animal2.H29_PackageAnimal2;

class Abid{
     void display(){
         System.out.println("I am a method in abid class in Animal 1");
     }
}
public class H28_PackageAnimal1 {
    public static void main(String[] args) {
      H29_PackageAnimal2 Rft = new H29_PackageAnimal2();
      Rft.display();
    }
}
