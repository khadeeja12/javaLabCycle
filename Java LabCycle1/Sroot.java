import java.io.*;
import java.lang.Math.*;
class Sqroot
{
    int n;
    double sq;
    public void read()
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter n");
            n=Integer.parseInt(in.readLine());
        }catch(Exception e)
        {}
    }

    public void Sqrt(Sqroot s)
    {
        sq=Math.sqrt(s.n);
    }
}

class Sroot
{
    public static void main(String args[])
    {
        Sqroot a=new Sqroot();
        Sqroot b=new Sqroot();
        a.read();
        b.Sqrt(a);
        System.out.println("Square Root is:"+b.sq);
    }
}


    
