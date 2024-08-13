
import java.io.*;


class Person {
    String name;
    int age;

   
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNumber;

    
    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}


class Teacher extends Person {
    String subject;

   
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class School {
    public static void main(String[] args) {
        DataInputStream din;
       din=new DataInputStream(System.in);
        int choice;

        do {
            System.out.println("\n1. Display Student Details");
            System.out.println("2. Display Teacher Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(din.readLine());

                switch (choice) {
                    case 1:
                        // Student details
                        Student student = new Student("Khadeeja", 21, 27);
                        System.out.println("\nStudent Details:");
                        student.displayDetails();
                        break;

                    case 2:
                        // Teacher details
                        Teacher teacher = new Teacher("Ms. Joseph", 35, "Computer");
                        System.out.println("\nTeacher Details:");
                        teacher.displayDetails();
                        break;

                    case 3:
                        System.out.println("Exiting the program");
                        return;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error " +e);
                
            }
        } while (true);
    }
}
