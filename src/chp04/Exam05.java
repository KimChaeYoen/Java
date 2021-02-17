package chp04;

public class Exam05 {

	public static void main(String[] args) {
		//주사위를 던져 나오는 수 얻기(1,2,3,4,5,6)
		//int value = ?;
		
		double temp = Math.random(); //Math.random 값을 실수형 temp 변수에 담는다
		
		System.out.println(temp); //[0//0을 포함하다는 거고,1) 1은 포함하지 않는다.
		System.out.println(temp * 6); //[0//0을 포함하다는 거고,1) 1은 포함하지 않는다.
		System.out.println((int)(temp * 6)); //0,1,2,3,4,5		
		System.out.println((int)(temp * 6)); //1,2,3,4,5,6		
	
		int value = (int)(temp * 6) + 1;
		
		//2로 나눈 나머지가 0이라는 것은 짝수란 이야기
		if(value%2 == 0) {
			System.out.println("짝수가 나왔어요");
		}else {
			 System.out.println("홀수가 나왔어요");
		}
	}
	
}
