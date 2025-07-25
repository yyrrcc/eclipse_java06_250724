package abstract1.shape;

public class Circle extends Shape {
	private int radius;
	public static final double PI = 3.141592;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	// getter setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	@Override
	public void getColor(String color) {
		// 비워두어도 됨
	}

}
