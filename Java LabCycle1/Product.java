import java.io.*;
class Product
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a,b;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the first number:");
a=Integer.parseInt(din.readLine());
System.out.println("Enter the second number:");
b=Integer.parseInt(din.readLine());
System.out.println("Product of " +a+ " and "+b+" is "+(a*b));
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}