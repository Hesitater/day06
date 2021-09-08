package day06;

//설계도 클래스는 main이 없습니다.
public class Pen {

	// 멤버변수 - 클래스의 속성을 나타냅니다. (필드) , 멤버변수는 선언만
	// 멤버변수 - 객체를 생성할때 각 데이터 타입의 기본 값으로 자동 초기화, 그 지역 안에서 사용가능

	String ink; // 멤버변수
	int price; // 멤버변수
	String company; // 멤버변수

	// 메서드 - 클래스의 기능을 나타냅니다(값의 변경도 메서드 안에서 )
	void write() { // 글씨쓰는 메서드
		System.out.println(ink + "색상 글씨를 씁니다");
	}

	void info() { // 정보보는 메소드
		System.out.println("=====펜의 정보=====");
		System.out.println("색상: " + ink);
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);

	}

}
