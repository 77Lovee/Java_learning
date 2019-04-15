public class Director{
	personBuilder pb;
	
	public void setPersonBuilder(personBuilder pb){
		this.pb = pb;
	}

	Person construct(){
		pb.BuildPerson();
		return pb.getPerson();
	}
}
