package loopex;


public class HelloLoopEx {

	public static void main(String[] args) {
		int i;//이름이 i인 정수형 변수를 선언
		
		for(i=0; i<=10; i++)//초기화식: 선언한 정수형 변수i에 0을 저장하여 초기화, 
							//조건식 : i의 값이 10보다 커지거나 같을 때까지만 반복하며
							//증감식 : 조건을 반복할 때 마다 i의 값을 1씩 증가시킨다.
		{
			
			System.out.println("안녕하세요!"+i);
			/*
			 *결과값
			 *안녕하세요!0
			 *안녕하세요!1
			 *안녕하세요!2
			 *안녕하세요!3
			 *안녕하세요!4
			 *안녕하세요!5
			 *안녕하세요!6
			 *안녕하세요!7
			 *안녕하세요!8
			 *안녕하세요!9
			 *안녕하세요!10
			 *
			 **/

		}

	}

}
