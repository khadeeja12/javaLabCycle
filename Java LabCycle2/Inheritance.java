import java.io.*;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            System.out.println("Enter details for Officer:");
            System.out.println("Name: ");
            String officerName = dis.readLine();
            System.out.println("Age: ");
            int officerAge = Integer.parseInt(dis.readLine());
            System.out.println("Phone Number: ");
            String officerPhoneNumber = dis.readLine();
            System.out.println("Address: ");
            String officerAddress = dis.readLine();
            System.out.println("Salary: ");
            double officerSalary = Double.parseDouble(dis.readLine());
            System.out.println("Specialization: ");
            String officerSpecialization = dis.readLine();

            Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, officerSalary, officerSpecialization);

            System.out.println("\nEnter details for Manager:");
            System.out.println("Name: ");
            String managerName = dis.readLine();
            System.out.println("Age: ");
            int managerAge = Integer.parseInt(dis.readLine());
            System.out.println("Phone Number: ");
            String managerPhoneNumber = dis.readLine();
            System.out.println("Address: ");
            String managerAddress = dis.readLine();
            System.out.println("Salary: ");
            double managerSalary = Double.parseDouble(dis.readLine());
            System.out.println("Department: ");
            String managerDepartment = dis.readLine();

            Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);

            System.out.println("\nOfficer details:");
            System.out.println("Name: " + officer.name);
            System.out.println("Age: " + officer.age);
            System.out.println("Phone Number: " + officer.phoneNumber);
            System.out.println("Address: " + officer.address);
            System.out.println("Salary: " + officer.salary);
            System.out.println("Specialization: " + officer.specialization);

            System.out.println("\nManager details:");
            System.out.println("Name: " + manager.name);
            System.out.println("Age: " + manager.age);
            System.out.println("Phone Number: " + manager.phoneNumber);
            System.out.println("Address: " + manager.address);
            System.out.println("Salary: " + manager.salary);
            System.out.println("Department: " + manager.department);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
