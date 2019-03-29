
public class object {
	/**********匿名对象创建****************/
	 public void say()
	 {
		 System.out.println("面朝大海,春暖花开");
	 }

	
	public static void main(String[] args)
	{
		Person P1= new Person();
		P1.Name="张三";
	    P1.Age=25;
		P1.talk();
		/*********/
	  new object().say(); //匿名对象引用
		 
				
	}
}

	class Person
	{
		
		String Name;
		int Age;
		void talk()
		{
			System.out.println("我是"+Name+"，今年"+Age+"岁");
		}
	}
	
	
