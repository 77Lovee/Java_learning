public abstract class ModeBuilder{
	protected Mode md = new Mode();

	public abstract void BuildMode();
	
	public Mode getMode(){
		return md;
	}

}

