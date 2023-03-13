package variable;

public class CharacterEx {

	public static void main(String[] args) {
		char ch1 = 'A'; //char는 문자를 나타내는 자료형 .선언과 동시에 값A 저장하여 초기화
		System.out.println(ch1);//ch1 출력 = A
		System.out.println((int)ch1); //변수 앞에(int)를 넣어줌으로 대문자 A에 해당하는 정수를 출력 

		char ch2 = 65; // 자료형을 문자형으로 지정하고 아스키코드값 65번을 저장.
		System.out.println(ch2);//65에 해당하는 문자를 출력
		
		int ch3 =65;
		System.out.println(ch3);
		System.out.println((char)ch3);//변수 앞에(char)를 넣어줌으로 65번값에 해당하는 문자 출력 
		
		char ch4 = '윤'; 
		char ch5 = '\uc724'; //'윤'에 해당하는 유니코드 값.
		System.out.println(ch4);
		System.out.println(ch5);
	}

}
