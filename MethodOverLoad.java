
public class MethodOverLoad {
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public float add(float a, float b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args)
	{
		int result;
		float result_f;
		MethodOverLoad test= new MethodOverLoad(); /*��ʵ����һ�����ù�������������ʵ�ֵ�*/
		result=test.add(1, 2);
		System.out.println("add����1+2="+result);
		result_f=test.add(1.3f, 3.6f);
		System.out.println("add����1.3+3.6="+result_f);
		result=test.add(1, 2, 3);
		System.out.println("add����1+2+3="+result);
		
		
	}

}
