import java.io.*;
class Even
{
 static DataInputStream din;
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
din=new DataInputStream(System.in);
try
{
 int sum=calculateEvensum();
System.out.println("sum of even numbers is : " +sum);

}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
 static int calculateEvensum()
{
int sum=0,i,eno,n;
try
{
System.out.println("Enter the limit:");
n=Integer.parseInt(din.readLine());
for(i=1;i<=n;i++)
{
eno=2*i;
sum=sum+eno;
}
}
catch(IOException e)
{
System.out.println("Error :"+e);
}
return sum;
}
}