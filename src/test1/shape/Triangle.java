package test1.shape;

public class Triangle extends Shape {

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public int area() {
		return super.area() / 2;
	}

}
