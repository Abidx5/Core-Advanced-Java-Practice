package Crack.Sol;


import javax.xml.namespace.QName;

class Student{
    String Name;
    int Age;
    int Id;
    static String UniName = "MBSTU";

Student(){
    System.out.println("No data");
}
 Student(String Name, int Age, int Id){
    this.Name= Name;  // hiding instance variable
    this.Age= Age;
    this.Id = Id;


}
    void displayData(){
        System.out.println(Name+ " "+Age+" "+Id+" "+UniName);

    }
}



public class H17_Constructor {

    public static void main(String[] args) {
        Student Abid = new Student("Abid Hassam",25,120000);
        Abid.displayData();
        Student Rifat = new Student("Rifat Farazi",26,100000);
        Rifat.displayData();
        Student Sagor = new Student();
        Sagor.displayData();

        System.out.println(Student.UniName);// access by class name static variable
    }
}
