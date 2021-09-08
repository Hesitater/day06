package day06;

public class PenMain {
	public static void main(String[] args) {
		
		
		//		객체생성 명령
		//		ClassName instanceName = new Constructor();
		
		
		//Pen의 기능을 사용 하고 싶다면 객체로 생성해야합니다!
		Pen black = new Pen(); // new + Constructor
		
		black.ink = "검정";				// black. 하면 옆에 기능들 나옴
		black.price = 2000;
		black.company = "모나미^^";
		black.write();
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 3000;
		red.company = "하잉테크!";
		red.write();
		
		black.info();
		red.info();
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(black.price));
		System.out.println(cal.add(red.price));
		
	}
}
