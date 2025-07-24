package test1.shape;

public class Shape {
	int width;
	int height;

	public Shape() {
		super();
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}

}
