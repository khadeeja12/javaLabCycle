import java.io.*;
class SeriesFact
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
float sum=0;
int n,i=1,fact=1;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the limit:");
n=Integer.parseInt(din.readLine());
for(i=1;i<=n;i++)
{
fact=fact*i;
sum += (float)i/fact; 
}
System.out.println("Sum of series: "+sum);
}

catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}