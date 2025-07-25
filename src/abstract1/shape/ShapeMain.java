package abstract1.shape;

public class ShapeMain {
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스를 만들지 못함
		// Shape shape = new Shape();

		// 생성자로 초기화
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("사각형의 넓이: " + rectangle.getArea());

		// setter로 초기화
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println("원의 넓이: " + circle.getArea());

		Triangle triangle = new Triangle();
		triangle.getColor("blue");

		// 업캐스팅 (부모 = new 자식)
		Shape shape = new Triangle(10, 10);
		System.out.println("삼각형의 넓이는 " + shape.getArea());

		// 다운캐스팅
		Triangle tri = (Triangle) shape;
		System.out.println("삼각형의 넓이는 " + tri.getArea());

	}
}
