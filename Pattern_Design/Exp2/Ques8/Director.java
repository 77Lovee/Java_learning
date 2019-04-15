public class Director{
	ModeBuilder  mb;
	public void setModeBuilder(ModeBuilder mb){
		this. mb = mb;
	}

	public Mode construct(){
		mb.BuildMode();
		return mb.getMode();
	}
}
