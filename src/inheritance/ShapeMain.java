package inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = 15;
		rectangle.height = 10;
		rectangle.recAngle = 50.5;

		Triangle triangle = new Triangle();
		triangle.width = 20;
		triangle.height = 30;
		triangle.color = "green";

		int triangleArea = triangle.area();
		System.out.println(triangleArea); // 메서드 오버라이딩 했음

		Rectangle rectangle2 = new Rectangle();
		rectangle2.width = 3;
		rectangle2.height = 5;
		System.out.println(rectangle2.area()); // 또다른 자식 triangle 의 영향 받지 않음

	}
}
