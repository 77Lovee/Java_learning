abstract class transportation{
	int speed;
	public abstract void move();
	public abstract void setSpeed(int speed);
	}

class Vehicle extends transportation{
	public void move(){
		System.out.println("我是汽车，正在路上奔跑,时速"+this.speed);
	}

	public void  setSpeed(int speed){
		if(speed<300&&speed>=0){
			this.speed=speed;
		}
		else
		System.out.println("速度不可超过300km/h");
		}


}

class Airplane extends transportation{
	public void move(){
		System.out.println("我是飞机，正在天上飞行，时速"+this.speed);
	}

	public void setSpeed(int speed){
		if(speed<2000&&speed>=0){
			this.speed=speed;
		}
		else
		System.out.println("速度不可超过2000km/h");

	}
}

class Boat extends transportation{
	public void move(){
		System.out.println("我是船，正在海面上航行,时速"+this.speed);
	}

	public void setSpeed(int speed){
		if(speed<500&&speed>=0){
		this.speed=speed;
	}
	else 
		System.out.println("速度不可超过500km/h");

	}
}

public class Ques5{
	public static void main(String[] args){
		Airplane plane = new Airplane();
		plane.setSpeed(1900);
		plane.move();
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(170);
		vehicle.move();
		Boat boat = new Boat();
		boat.setSpeed(250);
		boat.move();
	}
}
