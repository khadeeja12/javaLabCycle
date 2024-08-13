import java.io.*;
class SeriesSum
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int sum=0,n,i=1,j,isum=0;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the limit:");
n=Integer.parseInt(din.readLine());
while(i<=n)
{
 j=1;
 while(j<=i)
{
isum+=j;
j++;
}
 sum+=isum;
 i++;
}
System.out.println("Sum of series: "+sum);
}

catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}