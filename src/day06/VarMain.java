package day06;

public class VarMain {
	public static void main(String[] args) {
		
		//쓰고싶다? 일단 객체를 생성 하면 50%는 먹고들어감
		
		Variable var = new Variable();
		
		System.out.println(var.a); //여기까지 var.a값은 0 
		var.a = 100; // 변경
		var.printNumber(10);
		
		
	}
}
