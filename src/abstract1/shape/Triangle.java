package abstract1.shape;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// getter setter // 확인해보기
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
		return (width * height) / 2;
	}

	@Override
	public void getColor(String color) {
		System.out.println("삼각형 색: " + color);

	}

}
