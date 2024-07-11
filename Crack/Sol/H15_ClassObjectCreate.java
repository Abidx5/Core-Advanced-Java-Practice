package Crack.Sol;


 class Employe{
    String Name;
    int Salary;
    int Age;
    public void setData(String name, int salary, int age){
        Name= name;
        Salary= salary;
        Age = age;

    }
    public void printDetails(){
        System.out.println("Name = " + Name + " And Age = "+Age);
    }
    public int getSalary(){
        return Salary;
    }

}

class CellPhone{
     public void callPhone(){
         System.out.println("Calling .....");

     }
     public void vibratePhone(){
         System.out.println("Vibrate ....");
     }
}

public class H15_ClassObjectCreate {

    public static void main(String[] args) {
         Employe Abid = new Employe();
         Employe Rifat = new Employe();

         Abid.setData("Abid Hassan",100000,25);
         Rifat.setData("Rifat Farazi",120000,26);


         Abid.printDetails();

        System.out.println(Abid.getSalary());
        System.out.println(Rifat.getSalary());

        CellPhone Phone= new CellPhone();
        Phone.callPhone();

    }
}
