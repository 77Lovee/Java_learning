public class UseConstruct
{
	public static void main(String[] args)
	{
		Manager m = new Manager("王飞",10000,"业务部");//初始化赋值
		System.out.println(m.getSalary());
      }
}
class Employee 
{
	private String name;//名字
	private int salary;//薪水
	//构造函数
	public Employee(String _name, int _salary)
	{
		name = _name;
		salary = _salary;
	}
	public String getSalary() 
	{
		String str;
		str = "名字: " + name + "\nSalary: " + salary;
       	return str;
	}
}
class Manager extends Employee 
{
	private String department;
	//构造函数
	public Manager(String _name, int _salary, String _department)
	{
		super(_name,_salary);
		department = _department;
	}
	public String getSalary() 
	{
		return super.getSalary() + "\nDepartment: " + department;
	}
}
