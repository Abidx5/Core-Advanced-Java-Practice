package Crack.Sol.ConstructoorSetterGetter;
class Student {
    private String name;
    private int id;
    private int age;
    private String department;

    // Constructor for mandatory fields
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Setters for optional fields
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
public class ConstractorGetter {
    public static void main(String[] args) {
        Student student = new Student("Abid", 1, 20);
        student.setDepartment("MBSTU");

        System.out.println(student.getName() + " " + student.getId() + " " + student.getAge() + " " + student.getDepartment());
    }
}


/////////////

