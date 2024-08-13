import java.io.*;
class SortArray
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a[];
int i,j,temp,n;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the limit:");
n=Integer.parseInt(din.readLine());
a=new int[n];
System.out.println("Enter the elements to array:");
for(i=0;i<n;i++)
{
 a[i]=Integer.parseInt(din.readLine());
}
System.out.println("The array is :");
for(i=0;i<n;i++)
{
 System.out.print(a[i]+"\t");
}
System.out.println("\n");
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
 if(a[j]>a[j+1])
 {
  temp=a[j];
  a[j]=a[j+1];
  a[j+1]=temp;
 }
}
}
System.out.println("The Array elements after sorting is:");
for(i=0;i<n;i++)
{
 System.out.print(a[i]+"\t");
}
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}