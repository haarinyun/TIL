package variable;

public class IntegerVariable {

	public static void main(String[] args) {
		/*정수 자료형의 종류 
		 *1.byte(1byte =8bit)
		 *2.short(2byte =16bit)
		 *3.int(4byte =32bit)
		 *4.long(8byte =64bit)
		 * long을 사용할 때는 뒤에 L이나 l을 붙여 long형임을 알려줘야한다.
		 * */
		
		
		//자료형이 다른 변수끼리 더하기.
		short age1 = 10; //선언과 동시에 값을 저장해서 초기화시킴
		byte age2 = 30;  //선언과 동시에 값을 저장해서 초기화시킴
		
		System.out.println(age1+age2);// 정수의 기본형은 int로 두 정수를 더하기 전에 모두 int로 변환된다. 
		

	}

}
