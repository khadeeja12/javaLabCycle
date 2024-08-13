import java.io.*;
class PrintWhile
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int s,n;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the start limit:");
s=Integer.parseInt(din.readLine());
System.out.println("Enter the end limit:");
n=Integer.parseInt(din.readLine());
System.out.println("The elements from " +s+ "and "+n+ " are: " );
while(s<=n)
{
 System.out.println(s);
 s++;
}
}

catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}