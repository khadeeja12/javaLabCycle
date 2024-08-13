import java.io.*;

class Employee {
    void display() {
        System.out.println("Name of class is Employee.");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void calcSalary() {
        System.out.println("Salary of employee is 20000.");
    }
}

public class Engineer {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter 1 to display Employee, 2 to display Engineer: ");
            int choice = Integer.parseInt(reader.readLine());

            Employee employee;
            if (choice == 1) {
                employee = new Employee();
            } else if (choice == 2) {
                employee = new Engineer();
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            employee.display(); // Calls display() from Employee class
            employee.calcSalary(); // Calls calcSalary() from Engineer class if object is of type Engineer
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}




