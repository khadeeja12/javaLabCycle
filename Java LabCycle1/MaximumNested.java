import java.io.*;
class Max
{
 int n1,n2,n3;
 static int function1(int n1,int n2)
{
 if(n1>n2)
       return n1;
 else
      return n2;
}
static int function2( int n1,int n2,int n3)
 {
  int max=function1(n1,n2);
  if (max>n3)
       return max;
  else
      return n3; 
 }
}
public class MaximumNested
{
 public static void main(String args[])
{
Max m=new Max();
int a,b,c,large;
System.out.println("Khadeeja Beevi C N");
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
large=m.function2(a,b,c);
System.out.println("Maximum = " +large);
}
catch(Exception e)
{
System.out.println("Error " +e);

}
}
}
