import java.io.*;
class Maximum
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a,b,c;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the first number:");
a=Integer.parseInt(din.readLine());
System.out.println("Enter the second number:");
b=Integer.parseInt(din.readLine());
System.out.println("Enter the third number:");
c=Integer.parseInt(din.readLine());
if(a>b)
{
 System.out.println("Maximum is :"+a);
}
else if(b>c)
{
 System.out.println("Maximum is :"+b);
}
else
{
 System.out.println("Maximum is :"+c);
}
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}