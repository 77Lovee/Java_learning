//import Student;
public class Init{
	public static void main(String[] args){
		
		Student[] StuArr = new Student[2];
		StuArr[0]=new Student("Xiao Ming",16);
		StuArr[0].SetMajor("IE");
		StuArr[0].SetPhoneNumber("157****8629");
		StuArr[0].SetSchoolId("61101162**abc");
		//StuArr[0].GetInfo();
		StuArr[1] = new Student("Li Hua", 15);
		StuArr[1].SetMajor("EE");
		for(int i=0; i<StuArr.length;i++)
			if(i == 0)
			StuArr[i].Getinfo();
			else
			StuArr[i].GetInfo();
		}
 	}

