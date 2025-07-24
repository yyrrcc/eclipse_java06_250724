package test1.shape;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.width = 10;
		rec1.height = 20;
		System.out.println("사각형의 넓이는 " + rec1.area());

		System.out.println("--------------------");

		Triangle tr1 = new Triangle(5, 10);
		System.out.println("삼각형의 넓이는 " + tr1.area());

		System.out.println("--------------------");

		Circle cir1 = new Circle(3);
		System.out.println("원의 넓이는 " + cir1.area());
	}

}
