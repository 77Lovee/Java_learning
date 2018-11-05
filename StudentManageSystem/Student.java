class Student{
	String Name;
	String SchoolId = null;
	String PhoneNumber = null;
	String Major = null;
	int Age;
	
	public Student( String Name, int Age){
		this.Name = Name;
		this.Age  = Age;
		}

	void SetSchoolId(String SchoolId){
		this.SchoolId = SchoolId;
		}
	
	void SetPhoneNumber(String PhoneNumber){
		this.PhoneNumber = PhoneNumber;
		}
	void SetMajor(String Major){
		this.Major = Major;
		}

//	void Getinfo(){
//		System.out.println("*******************************************************************************");
//		System.out.println("     Name      Age      Major     PhoneNumber      SchoolId             ");
 //		System.out.println("*******************************************************************************");
//		System.out.println("    "+this.Name+"      "+this.Age+"      "+this.Major+"      "+this.PhoneNumber+"     "+this.SchoolId);
//}
//	void GetInfo(){
//		System.out.println("    "+this.Name+"      "+this.Age+"      "+this.Major+"      "+this.PhoneNumber+"     "+this.SchoolId);

//		 }
}

