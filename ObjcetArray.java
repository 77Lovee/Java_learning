class People{
	String Name;
	int Age;
	
	public People(String Name,int Age) {
		this.Name =Name;
		this.Age =Age;
		
	}
	
	public void talk()
	{
		System.out.println("����"+this.Name+"����"+this.Age+"�ꡣ");
	}
}

public class ObjcetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People P[]= {
				new People("����", 15),
				new People("����",46),
				new People("����",67)
		};
				
		for(int j=0;j<P.length;j++)
		{
			P[j].talk();
		}

	}

}
