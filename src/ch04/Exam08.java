package ch04;

public class Exam08 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	//메인 메소드다~~~ 
		
		//왜 여기서 변수 선언을 했을까융?
		int sum = 0;
		int i; //i를 여기에 선언하면 
		//for문 안에서도 사용가능하고
		for(i=1;i<=10;i++) {
			int value = i;
			sum += value; //sum =+ i;
		}
		//for문 밖에서도 사용가능하다
		System.out.println("1~" + i + ":" + sum);
	}
}
