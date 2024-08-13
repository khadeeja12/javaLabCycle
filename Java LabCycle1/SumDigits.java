import java.io.*;
class SumDigits
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
DataInputStream din;
int num,sum;
try
{
din=new DataInputStream(System.in);
System.out.println("Enter the number:");
num=Integer.parseInt(din.readLine());
sum=calculateSum(num);
System.out.println("Sum of digits is: " + sum);
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
 static int calculateSum(int num)
{
int sum=0,rem,n;
n=num;
while(n!=0)
{
 rem=n%10;
 sum=sum+rem;
 n=n/10;
}
 return sum;
}
}