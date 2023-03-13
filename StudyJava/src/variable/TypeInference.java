package variable;

public class TypeInference {

	public static void main(String[] args) {
		//자바 10부터는 자료형을 명시하지 않아도 변수를 사용할 수 있음.(지역 변수만 가능함)
		
		var number = 5;
		var dNumber = 5.5;
		var str = "Hello World";
		System.out.println(number);
		System.out.println(dNumber);
		System.out.println(str);
		
		// var number = 'a'; 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없다.
		number = 21; //다른 값을 넣는것은 가능.
		System.out.println(number);

	}

}
