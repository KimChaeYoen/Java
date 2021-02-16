package ch02;

public class Exam02 {

	public static void main(String[] args) {
		
		//자동 타입 변환
		byte var1 = 10; //1바이트
		int var2 = var1;//1바이트가 4바이트에 들어가는 거임
		//System.out.println("var2: " + var2);
		
		//강제 타입 변환
		int var3 = 1000;//4바이트
		//쪼개는 단위를 byte단위로 쪼개서 가장 맨 마지막에 있는 값을 저장할거임.
		byte var4 = (byte)var3; // 4바이트가 1바이트에 들어가는 거임 
		//System.out.println("var4: " + var4);
		
		//---------------------------------
		
		//자동 타입 변환(정수는 실수보다 항상적은 범위)
		long var5 = 10;
		double var6 = var5;//정수를 실수로 넣는것은 언제나 가능함
		
		//강제 타입 변환 (실수는 정수보다 항상 큰 범위)
		float var7 = 10.5f;
		long var8 = (long)var7;// 실수타입을 정수타입으로 바꿔놓을 수 없으므로..강제 형변환
		
		//-------------------------------------
		
		//실수를 정수로 변환
		double var9 = 3.14;
		int var10 = (int)var9;
		System.out.println("var10 : " + var10);
		
	}

}
