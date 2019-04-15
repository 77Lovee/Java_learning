class Circle extends Geometry{
	double radius;
	public void draw(){
		System.out.println("画了一个Circle");
	}
	
	public void erase(){
		System.out.println("Circle 被擦除");
	}

	public double get_area(){
		return this.radius*this.radius*3.14;
	}
}


class Rectangle extends Geometry{
	double width, height;
	public void draw(){
		System.out.println("画了一个Rectangle");
	}

	public void erase(){
		System.out.println("Rectangle被擦除");
	}

	public double get_area(){
		return this.width*this.height;
	}
}

class Square extends Geometry{
	double side;
	public void draw(){
		System.out.println("画了一个Square");
	}
	
	public void erase(){
		System.out.println("Square 被擦除");
	}

	public double get_area(){
		return this.side*this.side;
	}
}

	

class GeometryFactory{
	public static Geometry createGeometry(String name){
		if(name.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if(name.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		else if(name.equalsIgnoreCase("Square")){
			return new Square();
		}
		else{
			return null;
		}
	}
}

public class Ques2{
	public static void main(String[] args){
		Geometry geo;
		geo = GeometryFactory.createGeometry("Circle");
		geo.draw();
		geo.erase();
		geo = GeometryFactory.createGeometry("Rectangle");
		geo.draw();
		geo.erase();
		geo = GeometryFactory.createGeometry("Square");
		geo.draw();
		geo.erase();
		}
}


