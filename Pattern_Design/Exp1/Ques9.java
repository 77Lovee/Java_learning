abstract class Container{
	protected double radius;
	public Container(double radius){
		this.radius = radius;
		}
	abstract double surface_area();
	abstract double volume();
}

class Cube extends Container{
	public Cube(double radius){
	//	this.radius = radius;
		super(radius);
	}
	
	public double surface_area(){
		return radius*radius*6;
	}
	public double volume(){
		return radius*radius*radius;
	}
}

class Sphere extends Container{
	public Sphere(double radius){
	//	this.radius = radius;
		super(radius);
	}
	
	public double surface_area(){
		return 4*3.14*radius*radius;
	}

	public double volume(){
		return 4.0/3*radius*radius*radius;
	}
}

class Cylinder extends Container{
	double height;
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}

	public double surface_area(){
		return 2*3.14*radius*radius+2*3.14*radius*height;
	}
	
	public double volume(){
		return 3.14*radius*radius*height;
	}
}

public class Ques9{
	public static void main(String[] aras){
		Cube cube = new Cube(3);
		System.out.println("Cube半径为"+cube.radius+" 面积为"+cube.surface_area());
		System.out.println("Cube 体积为" + cube.volume());
		Sphere sphere = new Sphere(4);
		System.out.println("Sphere半径为"+sphere.radius+"面积为"+sphere.surface_area());
		System.out.println("Sphere 体积为"+sphere.volume());
		Cylinder cylinder = new Cylinder(3,4);
		System.out.println("Cylinder半径为"+cylinder.radius+"高为"+cylinder.height+" 面积为"+cylinder.surface_area());
		System.out.println("Cylinder 体积为"+cylinder.volume());
	}
}
