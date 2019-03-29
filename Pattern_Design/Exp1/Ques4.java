
class Tpoint{
	double x;
	double y;
	double z;
	public Tpoint(){}
	public Tpoint(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setPoint(double x, double y){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double get_x(){
		return this.x;
	}

	public double get_y(){
		return this.y;
	}
	
	public double get_z(){
		return this.z;
	}
	
	public void x_move(){
		this.x++;
	}
	
	public void y_move(){
		this.y++;
	}

	public void z_move(){
		this.z++;
	}
	public static  double calcDistance(Tpoint p1, Tpoint p2){
		double distance;
		double p1_x=p1.get_x();
		double p2_x=p2.get_x();
		double p1_y=p1.get_y();
		double p2_y=p2.get_y();
		double p1_z=p1.get_z();
		double p2_z=p2.get_z();
		distance=Math.sqrt(Math.pow(p1_x-p2_x,2)+Math.pow(p1_y-p2_y,2)+Math.pow(p1_z-p2_z,2));
		return distance;
	}
}
public class Ques4{
	public static void main(String[] args){
		Tpoint p1 = new Tpoint(1,1,1);
		Tpoint p2 = new Tpoint(2,2,2);
		System.out.println(Tpoint.calcDistance(p1,p2));
	}
}
