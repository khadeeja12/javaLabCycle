import java.io.*;
class SearchArray
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a[];
int i,item=0,f=0,n,pos=0;
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
System.out.println("Enter the element to Search:");
item=Integer.parseInt(din.readLine());
for(i=0;i<n;i++)
{
 if(item==a[i])
 {
     f++;
     pos=i+1;
 }
}
if(f==0)
{
 System.out.println("Element is not found");
}
else
{
 System.out.println("Element is found at position :" +pos);
}
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}