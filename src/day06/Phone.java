package day06;

public class Phone {

	String model;  //멤버변수들
	int price;
	String color;
	
	// 생정자는 클래스 이름과 동일합니다. 반환유형이 없습니다
	Phone()  {  // 보통 생성자는   멤버변수 아래에 쓴다 관례
		System.out.println("생성자 호오오출!");
		model = "햅틱";
		price = 20000;
		color = "black";
	}
	
	//생성자 여러개 선언할 수 있습니다.
	//단, 매개변수 종류 or 개수를 다르게 해야합니다.
	// 모델명을 받는다
	Phone(String pModel) {
		model = pModel;
		price = 30000;
		color = "red";
		
	}
	
	
	//모델값과 가격을 받는다
	
	Phone(String pModel, int pPrice) {
		model = pModel;
		price = pPrice;
		color = "White";
		
		
	}
	
//	//가로본능 내 답변
//	Phone(String widthPhone, int widthPrice, String widthColor) {
//		model = widthPhone;
//		price = widthPrice;
//		color = widthColor;
//		
//	}
	
	
	
	Phone(String pColor, int pPrice, String pModel) {
		model = pModel;
		price = pPrice;
		color = pColor;
		
		
	}
	
	
	
	
	
	
	//메서드 ?
	void info() {
		System.out.println("===휴대폰 정보===");
		System.out.println("모델 :" + model);
		System.out.println("가격 :" + price);
		System.out.println("색상: " + color);
		
		
		
	}
	
}
