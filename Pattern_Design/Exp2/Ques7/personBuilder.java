public abstract class personBuilder{
	protected  Person person = new Person();
	
	public abstract void BuildPerson();
	public Person getPerson(){
		return person;
	}
}

