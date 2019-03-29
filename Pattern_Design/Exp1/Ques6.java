import java.util.Scanner;
class Student{
	double score;
	static double total_score;
	static int count = 0;
	
	public  void account(){
		System.out.println("请输入分数, 以end结束输入");	
		Scanner reader = new Scanner(System.in);
		while(reader.hasNextDouble()){
		score = reader.nextDouble();
		count += 1;
		total_score += score;
  		}

	}

	public static double sum(){
	//	double mark;
	//	Scanner reader = new Scanner(System.in);
          //      while(reader.hasNextDouble()){
        //        mark = reader.nextDouble();
         //       count += 1;
         //       total_score += mark;
          //      }
		System.out.println("总分是："+total_score);
		return total_score;
	}
	
	public static double average(){
		System.out.println("全班"+count+"人的平均分是"+total_score/count);
		return total_score/count;
	}

}

public class Ques6{
	public static void main(String[] args){
	      Student stu = new Student();
	      stu.account();
        	Student.sum();
		Student.average();
	}
}
