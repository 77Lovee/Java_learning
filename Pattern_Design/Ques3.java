
class Dpoint{
	double x;
	double y;
	public Dpoint(){}
	public Dpoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double get_x(){
		return this.x;
	}

	public double get_y(){
		return this.y;
	}
	
	public void x_move(){
		this.x++;
	}

	public void y_move(){
		this.y++;
	}

	public static  double calcDistance(Dpoint p1, Dpoint p2){
		double distance;
		double p1_x=p1.get_x();
		double p2_x=p2.get_x();
		double p1_y=p1.get_y();
		double p2_y=p2.get_y();
		distance=Math.sqrt(Math.pow(p1_x-p2_x,2)+Math.pow(p1_y-p2_y,2));
		return distance;
	}
}

public class Ques3{
	public static void main(String[] args){

		Dpoint p1 = new Dpoint(0,0);
		p1.x_move();
		Dpoint p2 = new Dpoint(3,4);
		p2.x_move();
		System.out.println(Dpoint.calcDistance(p1,p2));
	}
}
	

