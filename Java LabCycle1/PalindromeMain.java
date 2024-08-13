import java.io.*;
class Palindrome
{
int num,rem,rev=0,n;
DataInputStream din;
void function1() throws IOException
{
din =new DataInputStream(System.in);
System.out.println("Enter the number:");
num=Integer.parseInt(din.readLine());
n=num;
while(num>0)
{
 rem=num%10;
 rev=(rev*10)+rem;
 num=num/10;
}
}
void function2()
{
 if(rev==n)
{
 System.out.println(1);
}
else
{
System.out.println(0);
}
}
}
class PalindromeMain
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
Palindrome p=new Palindrome();
try
{
p.function1();
p.function2();
}
catch(IOException e)
{
System.out.println("Error :"+e);
}
}
}