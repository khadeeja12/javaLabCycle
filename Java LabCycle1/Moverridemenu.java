import java.io.*;

class Person {
    String name;
    int age;

    void readDetails() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter name: ");
        name = dis.readLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(dis.readLine());
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String course;
    void readDetails() throws IOException {
        super.readDetails();
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter course: ");
        course = dis.readLine();
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}
class Teacher extends Person {
    String subject;
    void readDetails() throws IOException {
        super.readDetails();
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter subject: ");
        subject = dis.readLine();
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}
public class Moverridemenu {
public static void main(String[] args) {
    try {
        DataInputStream dis = new DataInputStream(System.in);
        int choice;
        Student student = null;
        Teacher teacher = null;

        do {
            System.out.println("\n1. Enter Student Details");
            System.out.println("2. Enter Teacher Details");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(dis.readLine());

            switch (choice) {
                case 1:
                    student = new Student();
                    student.readDetails();
                    break;

                case 2:
                    teacher = new Teacher();
                    teacher.readDetails();
                    break;

                case 3:
                    if (student != null) {
                        student.displayDetails();
                    } else {
                        System.out.println("Student details not entered yet.");
                    }
                    break;

                case 4:
                    if (teacher != null) {
                        teacher.displayDetails();
                    } else {
                        System.out.println("Teacher details not entered yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    } catch (IOException e) {
        System.out.println("Error: " + e);
    }
}

}


