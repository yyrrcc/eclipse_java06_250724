package test1.shape;

public class Circle extends Shape {
	double radius;
	final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public int area() {
		return (int) (radius * radius * PI);
	}
}
