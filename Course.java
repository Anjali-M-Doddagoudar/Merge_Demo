// File: Course.java
public class Course extends Student {
    String courseName;
    int courseMarks;

    public Course(String name, int age, String department, String courseName, int courseMarks) {
        super(name, age, department); // Call parent constructor
        this.courseName = courseName;
        this.courseMarks = courseMarks;
    }

    public void displayCourseDetails() {
        displayStudentDetails(); // Call parent method
        System.out.println("Course Name  : " + courseName);
        System.out.println("Marks        : " + courseMarks);
    }

    // Main method to test the inheritance
    public static void main(String[] args) {
        Course c1 = new Course("John", 21, "ECE", "Mathematics", 85);
        c1.displayCourseDetails();
    }
}
