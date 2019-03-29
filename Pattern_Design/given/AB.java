class A
 {
	public int x,y;
	A(int  a , int b)
	{
		x=a;
		y=b;
	}
	public void display()
	{
		int z;
		z=x+y;
		System.out.println("add="+z);	
	}
}
class B extends A
 {
	B(int  a , int b)
	{
		super(a,b);
	}
	public void display()
	{
		int z;
		z=x*y;
		System.out.println("product="+z);	
	}
}
public class AB extends B
 {
	AB(int  x , int y)
	{
		super(x,y);
	}
	public static void main(String[] args)
	{
		A num1=new A(4,10);
		B num2=new B(4,10);
		AB num3=new AB(4,10);
		num1.display();
		num2.display();
		num3.display();			
	}
}

