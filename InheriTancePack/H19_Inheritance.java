package InheriTancePack;


class Person {
    private String Name;
    private int Age;
    private double Height;

    public Person( String Name,int Age,double Height){
        this.Name = Name;
        this.Age = Age;
        this.Height = Height;
    }

    public void display(){
        System.out.println(" Name = "+Name+" Age = "+Age+" Height = "+Height);
    }
}



class Teacher extends Person{
    private String Qualification;

    public Teacher(String Name, int Age, double Height, String Qualification) {
        super(Name, Age, Height);
        this.Qualification = Qualification;

    }

    @Override
    public void display(){
        super.display();
        System.out.println(" Qualification = "+Qualification);
        //System.out.println(" Name = "+Name+" Age = "+Age+" Height = "+Height); need to use getter function
    }

}



public class H19_Inheritance {
    public static void main(String[] args) {

        Teacher Shishir = new Teacher("Shishir Mia",52,5.2,"Good Boss");
        Person Abid = new Person("Abid Hassan", 25,5.7);
        Abid.display();

      /* Shishir.Name = "Shishir Sir ";
      Shishir.Age= 40;
      Shishir.Height=5.2;*/

        Shishir.display();

    }
}
