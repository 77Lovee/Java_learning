public class TestRelation
{
	public static void main(String args[])
	{
		//变量初始化
		int a = 30;
		int b = 20;
		//定义结果变量
		boolean r1,r2,r3,r4,r5,r6;
		//计算结果
		r1 = a == b;
		r2 = a != b;
		r3 = a > b;
		r4 = a < b;
		r5 = a >= b;
		r6 = a <= b;
		//输出结果
		System.out.println("a = " + a + "   b = " + b);
		System.out.println("a==b = " + r1); 
		System.out.println("a!=b = " + r2);
		System.out.println("a>b = " + r3);
		System.out.println("a<b = " + r4);
		System.out.println("a>=b = " + r5);
		System.out.println("a<=b = " + r6);
    }
}