package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		//문자열 => 숫자(정수, 실수)
		
		//문자열은 String 타입 변수에 저장한다.
		String var1 = "10";//문자열을 저장하고 싶을때는 "" 로 표시함
		System.out.println("var1 : " + var1);
		
		//문자열과  숫자가 +가 되면 문자열화 된다
		String var2 = var1  + 5;
		
		//문자열을 숫자로 변경해서 연산
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3 : " + var3);
	
		//문자열을 실수로 변경해서 연산
		String var4 = "10.5";
		Double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var5: " + var5);
		
		//숫자를 문자열로 변경
		int var6 = 3;
		//방법1
		String var7 = "" + var6; //3을 문자열3으로 만드는 방법임
		String var8 = String.valueOf(var6);
		
		
	}

}
