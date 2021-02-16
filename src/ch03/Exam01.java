package ch03;

public class Exam01 {

	public static void main(String[] args) {
		
		//연산이 다양한 형태
		int var1 = 1;
		var1 = var1 + 1;
		System.out.println("var1 " + var1);
		
		int var2 = 1;
		var2 += 1;
		System.out.println("var2" + var2);
		
		int var3 = 10;
		var3 = var3 -1; 
		var3 -= 1;
		var3--;
		System.out.println("var3 " + var3);
		
		int var4 = 16;
		var4 = var4 /2;
		var4 /= 2;
		
		//자바는 정수 / (나눗셈)의 결과는 정수입니당!!
		int var5 = 11;
		int var6 = 4;
		int var7 = var5/var6;
		System.out.println("var6:" + var7);
		
		double var8 = 1.0 * var5/var6; //실수 나누기 정수가 되니까 실수가 나옴.
		double var9 = (double)var5 /var6;
		System.out.println("var9:" + var9);
		
		//나머지 구하기 
		int var10 = var4 % var5;
		System.out.println("var10:" + var10);
		
	}

}
