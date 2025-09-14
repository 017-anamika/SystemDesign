//Factory Pattern
interface shape {
	void draw();
}
class circle implements shape {
	public void draw() {
		System.out.println("Circle drawing..");
	}

}
class square implements shape {
	public void draw() {
		System.out.println("square drawing..");
	}

}

class shapeFactory {
	public static shape getShape(String name) {
		if(name ==null) return null;
		if(name == "CIRCLE") return new circle();
		else if(name == "SQUARE") return  new square();
		return null;
	}
}
class Main02 {
	public static void main(String [] args) {
		shapeFactory f1 = new shapeFactory();
		shape s1 = shapeFactory.getShape("CIRCLE");
		s1.draw();
		shape s2 = shapeFactory.getShape("SQUARE");
		s2.draw();
	}
}