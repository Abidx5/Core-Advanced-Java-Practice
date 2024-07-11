package InheriTancePack;

class BaseA{
   private String Name;
    private int Age;
   BaseA(String Name,int Age){
       this.Name = Name;
       this.Age = Age;

   }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}

class DerivedA1 extends BaseA{

    int Salary;
    DerivedA1(String Name,int Age, int Salary){
        super(Name,Age);
        this.Salary = Salary;

    }
}
class DerivedA2 extends BaseA{
    String Qualification;

    DerivedA2(String Name, int Age) {
        super(Name, Age);
    }
}

class DerivedB extends DerivedA1{
    double Height;
    DerivedB(String Name,int Age, int Salary,double Height){
        super(Name,Age,Salary);
        this.Height = Height;
    }

    void display(){
        System.out.println("Name = "+getName()+" Age = "+getAge()+ " Salary = "+ Salary+" Height = "+Height);

    }
}

public class H22_TypesOfInheritance {
    public static void main(String[] args) {
        DerivedB Abid = new DerivedB("Abid Hassan",25,150000,5.2);
        Abid.display();
    }
}
