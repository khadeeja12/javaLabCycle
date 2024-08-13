import java.io.*;
class Swap
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a,b,temp;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the first number:");
a=Integer.parseInt(din.readLine());
System.out.println("Enter the second number:");
b=Integer.parseInt(din.readLine());
System.out.println("Before Swapping : a = " +a+ " and b= "+b);
temp=a;
a=b;
b=temp;
System.out.println("After Swapping : a = " +a+ " and b= "+b);
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}