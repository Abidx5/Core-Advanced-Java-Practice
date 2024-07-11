package Crack.Sol;


class Employee{
    String name;  // default
    private int id;   // Private
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() { 
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class H16_AccessModifires {
    public static void main(String[] args) {

        Employee Abid = new Employee();
        Employee Rifat = new Employee();
        Abid.name="Abid Hassan";
        System.out.println(Abid.name);
        Abid.setId(19027);
        System.out.println(Abid.getId());

        Abid.setSalary(1000000000);
        System.out.println(Abid.getSalary());

    }
}



/*
package Crack.Sol.Inheritance;

import java.util.Scanner;

class Student{
    String Name;
    private int Id;
    private  int Age;
    static String Dept = "MBSTU";

    public void setId(int Id) {
        this.Id = Id;
    }
    public int getId() {
        return Id;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    void displayData(){
        System.out.print(Name+" "+ Id+" "+Age+" " );
    }
    static void displayDept(){
        System.out.println(Dept);
    }

}

public class H18_Inheritance {
    public static void main(String[] args) {
        Student Abid = new Student();
        Student Rifat = new Student();
        Scanner sc = new Scanner(System.in);
        Abid.Name= sc.next();
        Abid.setId(sc.nextInt());
        Abid.setAge(sc.nextInt());
        Abid.displayData();
        Student.displayDept();
    }
}


//              SOLID MAINTAINED CODE

/*

package Crack.Sol.Inheritance;

import java.util.Scanner;

// Single Responsibility Principle: Student class only holds student data
class Student {
    private String name;
    private int id;
    private int age;
    private static final String DEPT = "MBSTU";

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public static String getDept() {
        return DEPT;
    }
}

// Single Responsibility Principle: Separate class for input handling
class StudentInputHandler {
    private Scanner sc;

    public StudentInputHandler(Scanner sc) {
        this.sc = sc;
    }

    public Student getStudentInput() {
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        return new Student(name, id, age);
    }
}

// Single Responsibility Principle: Separate class for displaying data
class StudentDisplay {
    public void displayStudentData(Student student) {
        System.out.print(student.getName() + " " + student.getId() + " " + student.getAge() + " ");
    }

    public void displayDept() {
        System.out.println(Student.getDept());
    }
}

public class H18_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInputHandler inputHandler = new StudentInputHandler(sc);
        StudentDisplay display = new StudentDisplay();

        Student abid = inputHandler.getStudentInput();
        display.displayStudentData(abid);
        display.displayDept();

        sc.close();
    }
}


*/
