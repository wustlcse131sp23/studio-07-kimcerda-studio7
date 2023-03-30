package studio7;

public class Rectangle {
	// instance
	private double length;
	private double width;
	private boolean square;
	private double area;
	private double perimeter;
	private boolean largerThan;
	
	// constructor default
	public Rectangle() {
		this.length = 0;
		this.width = 0;
		this.square = false;
		this.area = 0;
		this.perimeter = 0;
		largerThan = false;
	}
	
	// constructor
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
		if (l == w) {
			this.square = true;
		}
		else {
			this.square = false;
		}
		this.area = l*w;
		this.perimeter = (l*2)+(w*2);
	}
		
	public Rectangle(boolean compare, double a1, double a2) {
		if (a1 > a2) {
			largerThan = true;
		}
		else {
			largerThan = false;
		}
	}
	
	public static void comparison(double a1, double a2) {
		System.out.println();
	}
	
	//getters
	public double getLength() { return this.length;}
	public double getWidth() { return this.width;}
	public double getArea() { return this.area;}
	public double getPerimeter() { return this.perimeter;}
	public boolean getSquare() { return this.square;}
	public String toString() {
		return this.length + " " + this.width + " " + this.square + " " + this.perimeter + " " + this.area;
	}

	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(2, 2);
		System.out.println(r1);
		Rectangle r2 = new Rectangle(4, 4);
		comparison(r1.getArea(), r2.getArea());
		
	}
}
