import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int number;
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext()) {
			number=reader.nextInt();
	//		System.out.println(number);
			myJudge.judge(number);
		}
		

		
	}
	
}

class myJudge{
	
	static public void judge(int number) {
		if(number<=0){
			System.out.println("输入了小于或等于零的数，退出程序");
			System.exit(0);
		}
		else if(number==2)
			System.out.println(number+"是素数");
		for(int i=2; i<number;i++) {
			if((number%i)==0){
						
					System.out.println(number+"不是素数"); break;
				}
			else if(i==number-1)
					System.out.println(number+"是素数");
		}
	}
}
