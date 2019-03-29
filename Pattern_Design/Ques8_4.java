import java.util.Scanner;
class Average extends MyArray{
	Average(int leng) {super(leng);}
	public static void average(){
		System.out.println("输入整数，以end结束输入");
		Scanner reader = new Scanner(System.in);
		int sum=0;
		int count=0;
		while(reader.hasNextInt()){
			sum+=reader.nextInt();
			count+=1;
		}
		System.out.println("Average:"+sum/count);
	}

}
		
public class Ques8_4{
	public static void main(String[] args){
		Average.average();
	}
}

		
