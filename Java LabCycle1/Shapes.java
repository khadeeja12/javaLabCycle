import java.io.*;
interface i1
{
	public int area();
}

class Triangle implements i1
{
	int b,h;
	public Triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public int area()
	{
		int a=(int)(0.5*b*h);
		return a;
	}
}

class Rectangle implements i1
{
	int l,b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int area()
	{
		return l*b;
	}
}

class Shapes
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			i1 obj[];
			int n,ch,l,b,a,i;
			System.out.println("Enter the no of objects");
			n=Integer.parseInt(in.readLine());
			obj=new i1[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the choice 1:Rectangle 2:Triangle ");
				ch=Integer.parseInt(in.readLine());
				if(ch==1)
				{
					System.out.println("Enter the length and breadth");
					l=Integer.parseInt(in.readLine());
					b=Integer.parseInt(in.readLine());
					obj[i]=new Rectangle(l,b);
				}
				else if(ch==2)
				{
					System.out.println("Enter the base and height");
					l=Integer.parseInt(in.readLine());
					b=Integer.parseInt(in.readLine());
					obj[i]=new Triangle(l,b);
				}
			}
			for(i=0;i<n;i++)
			{
				if(obj[i] instanceof Triangle)
					System.out.println("Area of Triangle :"+obj[i].area());
				else
					System.out.println("Area of Rectangle :"+obj[i].area());
			}
		}catch(Exception e){}
	}
}

				































			