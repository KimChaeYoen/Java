package chp04;

public class Exam04 {

	public static void main(String[] args) {
		
		char grad = 'D';
		
		switch(grad) {
		case 'A':
			System.out.println("커피를 대접합니다앙.");
			//break;
		case 'B':
			System.out.println("사탕 1하나만 줍니다.");
			break;
		case 'C':
			System.out.println("인사만 합니다.");
			break;
		default:
			System.out.println("신경쓰지 않습니다.");
		}
		
		
		//-----------------------------------
		
		if(grad == 'A'){
			System.out.println("커피를 대접합니다앙.");
			System.out.println("사탕 하나만 줍니댱");
		}else if(grad == 'B') {
			System.out.println("사탕 하나만 줍니다융");	
		}else if(grad == 'C') {
			System.out.println("인사만 합니다융");
		}else {
			System.out.println("신경쓰지 않습니다.");
		}
			
		
	}

}
