//方法重载
class MethodOverloading
{
	void receive (int i)
	{
		System.out.println("一个整数");
		System.out.println("i="+i);
	}
	void receive (int x,int y)
	{
		System.out.println("两个整数");
		System.out.println("x="+x+"y="+y);
	}
	void receive (double d)
	{
		System.out.println("一个浮点数");
		System.out.println("d="+d);
	}
	void receive (String s)
	{
		System.out.println("一个字符串");
		System.out.println("s="+s);
	}
}

public class MethodOverloadingTest
{	
	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.receive(1);
		mo.receive(2,3);
		mo.receive(12.56);
		mo.receive("Hello");
			
	}
}
