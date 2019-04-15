public class Ques8{
	public static void main(String[] args){
		Mode md;
		Director dir = new Director();
		dir.setModeBuilder(new SimpleModeBuilder());
		md = dir.construct();
		System.out.println("******************************");
		dir.setModeBuilder(new AllModeBuilder());
                md = dir.construct();
		System.out.println("******************************");
		dir.setModeBuilder(new MemoryModeBuilder());
                md = dir.construct();

	}
}
