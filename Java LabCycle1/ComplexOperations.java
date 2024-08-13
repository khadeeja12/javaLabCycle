import java.io.*;

class Complex {
    double real;
    double imaginary;

    void read() throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        System.out.print("Enter real part: ");
        real = Double.parseDouble(din.readLine());
        System.out.print("Enter imaginary part: ");
        imaginary = Double.parseDouble(din.readLine());
    }

    void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }

    
    Complex multiply(Complex c) {
        Complex result = new Complex();
        result.real = this.real * c.real - this.imaginary * c.imaginary;
        result.imaginary = this.real * c.imaginary + this.imaginary * c.real;
        return result;
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        try {
           System.out.println("Khadeeja Beevi C N");
            
            System.out.println("Enter the first complex number:");
            c1.read();

            System.out.println("Enter the second complex number:");
            c2.read();

            System.out.println("Entered Complex Numbers:");
            c1.display();
            c2.display();

 
            Complex sum = c1.add(c2);
            System.out.println("Sum of Complex Numbers:");
            sum.display();

           
            Complex product = c1.multiply(c2);
            System.out.println("Product of Complex Numbers:");
            product.display();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
