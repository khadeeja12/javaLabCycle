import java.io.*;
import java.util.*;

interface ishape {
    public double area();
}

class Circle implements ishape {
    double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements ishape {
    double length, bredth;

    public Rectangle() {
        this.length = 0;
        this.bredth = 0;
    }

    public Rectangle(double l, double b) {
        this.length = l;
        this.bredth = b;
    }

    public double area() {
        return length * bredth;
    }
}

class Triangle implements ishape {
    double base, height;

    public Triangle() {
        this.base = 0;
        this.height = 0;

    }

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double area() {
        return  (base * height)/2;
    }
}

class Trapezoid implements ishape {
    double base1, base2, height;

    public Trapezoid() {
        this(0, 0, 0);
    }

    public Trapezoid(double a, double b, double h) {
        this.base1 = a;
        this.base2 = b;
        this.height = h;
    }

    public double area() {

        return ((base1 + base2) / 2) * height;
    }
}

public class Ishapearea {
    public static void main(String[] args) {
        ishape obj = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your shape: ");
        System.out.println("1.Circle\t2.Triangle");
        double radius, base, height;
        System.out.println("3.Rectangle\t4.Trapezoid");
        double length, bredth, a, b, h;
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter the radius: ");
                radius = scan.nextDouble();
                obj = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the base: ");
                base = scan.nextDouble();
                System.out.print("Enter the height: ");
                height = scan.nextDouble();
                obj = new Triangle(base, height);
                break;
            case 3:
                System.out.print("Enter the length: ");
                length = scan.nextDouble();
                System.out.print("Enter the bredth: ");
                bredth = scan.nextDouble();
                obj = new Rectangle(length, bredth);
                break;
            case 4:
                System.out.print("Enter the a: ");
                a = scan.nextDouble();
                System.out.print("Enter the b: ");
                b = scan.nextDouble();
                System.out.print("Enter the h: ");
                h = scan.nextDouble();
                obj = new Trapezoid(a, b, h);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        System.out.println("Area = " + obj.area());
        scan.close();
    }
}