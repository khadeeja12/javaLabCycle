import java.io.*;
class Area
{
 int r;
 double a;
 DataInputStream din;
 public void calculatearea() throws IOException
{
din=new DataInputStream(System.in);
System.out.println("Enter the radius:");
r=Integer.parseInt(din.readLine());
a=3.14*r*r;
System.out.println("Area of circle : "+a);
}
}
 public class CircleArea
{
 public static void main(String args[])
{
System.out.println("Khadeeja Beevi C N");
try
{
Area a =new Area();
a.calculatearea();
}

catch(IOException e)
{
System.out.println("Error :"+e);
}
}
}