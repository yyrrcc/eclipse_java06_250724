package inheritance;

// 메서드 오버라이딩 (상속 관계에서)
public class Triangle extends Shape {

	// 애노테이션 : 특별한 주석이라고 생각하기
	@Override
	// 오버라이딩의 조건 : 메서드 이름, 반환타입, 매개변수 모두 동일 해야함
	public int area() {
		int area = (width * height) / 2;
		return area;
	}

	// 만약 부모 메서드를 그대로 물려 받고 싶으면?
	// 메서드 재정의 한 후에 super.class() 해주면 되는듯?

}
