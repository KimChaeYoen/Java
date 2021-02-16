package ch02;

public class Exam01 {

	public static void main(String[] args) {
		
		//정수 타입의 변수 선언과 값 저장
		byte var1 = 100;//-128~127
		short var2 = 1;
		int var3 = 1;
		long var4 = 1;
		
		//문자 타입의 변수 선언과 값 저장
		char var9 = 65;
		char var10 = '한';
		System.out.println("var9: " + var9);
		System.out.println("var10: " + var10);
		
		//실수 타입의 변수 저장과 값 저장
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789;//요놈이! float보다 정밀도가 높음~
		System.out.println("var5: " + var5);
		System.out.println("var5: " + var6);

		//논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
	}

}
