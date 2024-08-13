import java.io.*;
class Fact
{
 int a;
 static int calculateFact(int a)
{
 if(a==0 || a==1)
      return 1;
 else
     return a*calculateFact(a-1);
}
}

public class FactRecursion
{
 public static void main(String args[])
 {
  int n,factorial;
  System.out.println("Khadeeja Beevi C N");
  Fact f=new Fact();
  DataInputStream din;
  din=new DataInputStream(System.in);
  try
 {
  System.out.println("Enter the number:");
  n=Integer.parseInt(din.readLine());
  if(n>0)
  {
   factorial=f.calculateFact(n);
   System.out.println("Factorial of " +n+ " is : "+factorial);
  }
 }
 catch(Exception e)
{
 System.out.println("Error: "+e);
}
 }
}