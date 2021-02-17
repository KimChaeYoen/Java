package ch05;

public class Exam01 {

	public static void main(String[] args) {
	
		int var1 =10;
		int var2 = 10;
		
		//값비교
		System.out.println(var1 == var2);
		System.out.println(var1 != var2);
		
		String var3 = "자바";
		String var4 = new String("자바"); //문자열을 같지만
		
		//번지 비교
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false
		
		
		//문자열만을 비교할라면 .equals라는 문자열 함수 써서 비교
		System.out.println(var3.equals(var4));

		
	}

}
