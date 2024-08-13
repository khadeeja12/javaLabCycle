import java.io.*;
class RowColSum
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
int a[][];
int i,j,temp,n,rsum=0,csum=0,r,c;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter the no of rows:");
r=Integer.parseInt(din.readLine());
System.out.println("Enter the no of columns:");
c=Integer.parseInt(din.readLine());
a=new int[r][c];
System.out.println("Enter the elements to array:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
 a[i][j]=Integer.parseInt(din.readLine());
}
}
System.out.println("The array is :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
 System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("\n");
System.out.println("Row-wise sums:");
for ( i = 0; i < r; i++) 
{
       rsum = 0;
      for (j = 0; j < c; j++) 
       {
           rsum += a[i][j];
        }
       System.out.println("Row " + (i + 1) + ": " + rsum);
 }
System.out.println("Column-wise sums:");
for (j = 0; j < c; j++)
 {
             csum = 0;
            for ( i = 0; i < r; i++)
            {
                csum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + csum);
  }
}

catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}
