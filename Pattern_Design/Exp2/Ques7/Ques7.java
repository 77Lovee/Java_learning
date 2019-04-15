public class Ques7{

	public static void main(String[] args){
	Person person;
	Director dir = new Director();
	dir.setPersonBuilder(new TallPersonBuilder());
	person = dir.construct();
	System.out.println("一个Tall Person ");
	System.out.println(person.head+"\t"+person.body+"\t"+person.arms+"\t"+person.legs);
	dir.setPersonBuilder(new ShortPersonBuilder());
        person = dir.construct();
        System.out.println("一个Short Person ");
        System.out.println(person.head+"\t"+person.body+"\t"+person.arms+"\t"+person.legs);

	}
}
