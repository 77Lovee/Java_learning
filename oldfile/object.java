
public class object {
	/**********�������󴴽�****************/
	 public void say()
	 {
		 System.out.println("�泯��,��ů����");
	 }

	
	public static void main(String[] args)
	{
		Person P1= new Person();
		P1.Name="����";
	    P1.Age=25;
		P1.talk();
		/*********/
	  new object().say(); //������������
		 
				
	}
}

	class Person
	{
		
		String Name;
		int Age;
		void talk()
		{
			System.out.println("����"+Name+"������"+Age+"��");
		}
	}
	
	
