package day06;

public class Variable {

	// 멤버변수 초기화 하지 않더라도 기본값으로 자동초기화  정수형 0, 실수형 0.0, 논리형 false, 객체  null
	
	int a;
	
	void printNumber(int c) {
		
//		int b;
		int b = 1;  // 지역변수는 초기화 해야됨
		System.out.println("멤버변수: " + a); //자동 초기화 됨
		System.out.println("지역변수: " + b); //지역변수 써야됨
		System.out.println("매개변수: " + c); // 매개값이 전달되기때문에  들어옴 ?
		
		
		
	}
	
	
}
