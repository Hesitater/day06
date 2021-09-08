package day06;

public class PhoneMain {
	public static void main(String[] args) {
		
		
		Phone black = new Phone();
		black.info();
		
		Phone iPhone = new Phone("아이폰");
		iPhone.info();
		
		Phone galaxy = new Phone("갤럭시10노트", 1000000);
		galaxy.info();
		
		
		//모든 멤버변수를 받는 생성자를 만들고
		//초록색, 100000원, 가로본등 으로 객체를 생성
		
//		//내답변
//		Phone widthPhone = new Phone("가로본능",100000, "초록색");
//		widthPhone.info();
		
		//선생님답ㅂㄴ
		Phone shaomi = new Phone("green", 100000, "샤오미");
		shaomi.info();
		
		
		
	}
}

