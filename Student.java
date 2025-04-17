// File: Student.java
public class Student {
    String name;
    int age;
    String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Department   : " + department);
    }
}
