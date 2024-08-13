import java.io.*;
class Display
{
 int n;
 static void displayNto1(int n)
{
 if(n>0)
{
      System.out.println(n+"");
      displayNto1(n-1);
}
}
static void display1toN(int n)
{
 if(n>0)
 {
      display1toN(n-1);
      System.out.println(n+"");
 }
}
}

public class DisplayRecursion
{
 public static void main(String args[])
 {
  int l;
  System.out.println("Khadeeja Beevi C N");
  Display d=new Display();
  DataInputStream din;
  din=new DataInputStream(System.in);
  try
 {
  System.out.println("Enter the limit:");
  l=Integer.parseInt(din.readLine());
  if(l>0)
  {
   System.out.println("The numbers from "+l+ "1 is");  
   d.displayNto1(l);
  System.out.println("The numbers from 1 to " +l+ "is ");  
   d.display1toN(l);
  }
 }
 catch(Exception e)
{
 System.out.println("Error: "+e);
}
 }
}