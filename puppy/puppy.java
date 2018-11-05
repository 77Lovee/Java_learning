class dog{
	int age = 2;
	String name;
	void SetName(String name){
		this.name = name;
		}

	void GetName(){
		System.out.println("dog's name:"+name);
		}
	void GetAge(){
		System.out.println(name+" 's age:"+age);

	}
  }


public class puppy{
	public static void main(String[] args){
		dog puppy = new dog();
		puppy.SetName("Tom");
		puppy.GetName();
		puppy.GetAge();
	}
}
	
