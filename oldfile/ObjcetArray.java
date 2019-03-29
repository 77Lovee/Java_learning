class People{
	String Name;
	int Age;
	
	public People(String Name,int Age) {
		this.Name =Name;
		this.Age =Age;
		
	}
	
	public void talk()
	{
		System.out.println("我是"+this.Name+"今年"+this.Age+"岁。");
	}
}

public class ObjcetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People P[]= {
				new People("张三", 15),
				new People("李四",46),
				new People("赵武",67)
		};
				
		for(int j=0;j<P.length;j++)
		{
			P[j].talk();
		}

	}

}
