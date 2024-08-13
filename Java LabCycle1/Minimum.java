import java.io.*;
class Minimum
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a,b,c,t;
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
t=(a<b)?a:(b<c)?b:c;
System.out.println("Minimum is :"+t);
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}