package chp04;

public class Exam12 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	
		int count = 0;
		
		while(true) {
			count++;
			if(count%2 == 0) {
				continue; //continue는 여기서 멈추고 다시 조건으로 돌아가라
			}
			System.out.println(count);
			if(count>10) {
				break; //이 반복을 벗어나버니이
			}
		}
		System.out.println("프그래매 마무리 내용 실행");
	}
	
}
