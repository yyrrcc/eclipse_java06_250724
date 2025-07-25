package abstract1.shape;

public class Rectangle extends Shape {
	// 추상 클래스를 상속 받으려고 하면, 무조건 모든 추상 메서드를 오버라이딩 해야한다

	private int width;
	private int height;

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public void getColor(String color) {
		System.out.println("사각형 색: " + color);
	}

}
