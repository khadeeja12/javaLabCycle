import java.io.*;
class Reverse
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
DataInputStream din;
int num;
try
{
din=new DataInputStream(System.in);
System.out.println("Enter the number:");
num=Integer.parseInt(din.readLine());
calculateReverse(num);
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
 static void calculateReverse(int num)
{
int rev=0,rem,n;
n=num;
while(n!=0)
{
 rem=n%10;
 rev=(rev*10)+rem;
 n=n/10;
}
System.out.println("Reverse is: " +rev);
}
}
