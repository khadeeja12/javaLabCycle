import java.io.*;
interface Shape
{
    public void disp();
    public double calc();
}

class Circle implements Shape
{
    int r;
    public void disp()
    {
           System.out.println("Radius :"+r);
    }

    public double calc()
    {
        return ((4/3)*3.14*r*r*r);
    }
    public Circle(int r)
    {
        this.r=r;
    }

}

class Rectangle implements Shape
{
    int l,w,h;
    public void disp()
    {
        System.out.println("Length :"+l+" Width :"+w+" Height :"+h);
    }

    public double calc()
    {
        return l*w*h;
    }
    public Rectangle(int l,int w,int h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

}

class ShapesCR
{
    public static void main(String args[])
    {
        
        Shape s[];
        DataInputStream in=new DataInputStream(System.in);
        try{
             
             System.out.println("Enter the no of objects");
             int n=Integer.parseInt(in.readLine());
             s=new Shape[n];
             int ch,w,l,h,r;
             for(int i=0;i<n;i++)
             {
                System.out.println("Enter the choice 1:Circle 2:rectangle");
                ch=Integer.parseInt(in.readLine());
                if(ch==1)
                {
                    System.out.println("Enter the radius");
                    r=Integer.parseInt(in.readLine());
                    s[i]=new Circle(r);
                    System.out.println("Volume is :"+s[i].calc());
                }
                else if(ch==2)
                {
                    System.out.println("Enter the length,width,height");
                    l=Integer.parseInt(in.readLine());
                    w=Integer.parseInt(in.readLine());
                    h=Integer.parseInt(in.readLine());
                    s[i]=new Rectangle(l,w,h);
                    System.out.println("Volume is :"+s[i].calc());
                }
             }             
        }
        catch(Exception e){}

    }
}