package conditional;

public class ConditionalEx2 {

	public static void main(String[] args) {
		int age = 9;
		int charge;
		if(age <8) {
			charge=1000;
			System.out.println("어린이입니다. 입장료는"+charge+"원입니다.");		
		}
		else if(age <14) {
			charge = 2000;
			System.out.println("초등학생입니다. 입장료는"+charge+"원입니다.");
			
		}
		else if(age <20) {
			charge = 3000;
			System.out.println("청소년입니다. 입장료는"+charge+"원입니다.");
			
		}
		else if(age <60) {
			charge = 0;
			System.out.println("경로우대입니다. 입장료는"+charge+"원입니다.");
			
		}
		else  {
			charge=4000;
			System.out.println("성인입니다. 입장료는"+charge+"원입니다.");
			
		}
		

	}

}
