import java.util.Scanner;
class person{
	long id;
	String name;
	String gender;
	int age;	
	person(){}
	person(int id, String name, String gender, int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void setId(long id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public void setGender(String gender){
		this.gender = gender;
	}
}

class student extends person{
 	String dep;
	int scores;
	student(){}
	student(int id, String name, String gender, int age, String dep, int scores){
		super(id, name, gender, age);
		this.dep = dep;
		this. scores = scores;
	}
	
	public void setDep(String dep){
		this.dep = dep;
	}
	
	public void setScores(int scores){
		this.scores = scores;
	}
	
	public void setInfo(){
		Scanner reader = new Scanner(System.in);
		System.out.print("输入姓名：");
		this.name = reader.next();
		System.out.print("输入性别：");
		this.gender = reader.next();
		System.out.print("输入年龄：");
		this.age = reader.nextInt();
		System.out.print("输入编号：");
		this.id = reader.nextLong();
		System.out.print("输入所在系：");
		this.dep = reader.next();
		System.out.print("输入成绩：");
		this.scores = reader.nextInt();
	}
	public void showInfo(){
		System.out.println("姓名:"+this.name+"   性别:"+ this.gender+"   年龄:" + this.age +"   编号:"+ this.id+"   所在系:"+ this.dep + "  成绩:"+this.scores);
	 }
	
}

class teacher extends person{
	String dep;
	String occupation;
	teacher(){}
	teacher(int id, String name, String gender, int age, String dep,String  occupation){
		super(id, name, gender, age);
		this.dep = dep;
		this.occupation = occupation;
	}

	public void setDep(String dep){
		this.dep = dep;
	}

	public void setOccupaiton(String occupation){
		this.occupation = occupation;
	}

	public void setInfo(){
		 Scanner reader = new Scanner(System.in);
                System.out.print("输入姓名：");
                this.name = reader.next();
                System.out.print("输入性别：");
                this.gender = reader.next();
                System.out.print("输入年龄：");
                this.age = reader.nextInt();
                System.out.print("输入编号：");
                this.id = reader.nextLong();
                System.out.print("输入所在系：");
                this.dep = reader.next();
                System.out.print("输入职称：");
                this.occupation = reader.next();
      }

	   public void showInfo(){
	
              System.out.println("姓名:"+this.name+"   性别:"+ this.gender+"   年龄:" + this.age +"   编号:"+ this.id+"   所在系:"+this.dep +"   职称:"+this.occupation);
         }
}

public class Ques7{
	public static void main(String arg[]){
		student stu = new student();
		stu.setInfo();
		stu.showInfo();
	}
 }
