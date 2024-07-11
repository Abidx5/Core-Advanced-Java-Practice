package InheriTancePack;

import java.util.PrimitiveIterator;
import java.util.Scanner;

class AClass{
   private String Name;
   private int Age;
   private int Salary;
   AClass(){

       System.out.println("Aclass default Cons");

   }

   AClass (String Name, int Age, int Salary){
       this();
       this.Name = Name;
     this.Age = Age;
     this.Salary = Salary;
   }


   void display(){
       System.out.println(" Name = "+Name+" Age = "+Age+" Salary = "+Salary);
   }


    //    Arguments Pass using this --

   void compareSalary(AClass other){
     if(this.Salary > other.Salary)
         System.out.println(this.Name+" Sal is more than "+other.Name);
     else System.out.println(other.Name+" Salary is more than "+this.Name);
   }

}


class BClass extends AClass{
    private String Degree;

    BClass (String Name, int Age, int Salary, String Degree) {
        //this(); // Calls the default constructor of BClass, which calls super()
        super(Name, Age, Salary); // Calls the parameterized constructor of AClass
        this.Degree = Degree;
    }
   BClass(String Name, int Age, int Salary){
       super(Name, Age, Salary);
   }

    @Override
    void display() {
        super.display();
        System.out.println("Degree = "+ Degree);
    }
}


public class H21_ThisKeyUse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        int Salary = sc.nextInt();

        BClass Abid = new BClass(Name,Age,Salary);
        Abid.display();

        BClass Rifat = new BClass("Rifat",25,100000,"BSCENG");
        Rifat.display();

        Abid.compareSalary(Rifat);
        Rifat.compareSalary(Abid);
    }
}
