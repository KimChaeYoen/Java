package ch03;

public class Exam02 {

	public static void main(String[] args) {
	
		//������ ����� boolean Ÿ������ ������ �����ȣ
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //false
		boolean var4 = var1 != var2; //true
		boolean var5 = var1 > var2; //false
		boolean var6 = var1 >= var2; //false
		boolean var7 = var1 < var2; //true
		boolean var8 = var1 <= var2; //true
		boolean var9 = !(var1 == var2); // true
		boolean var10 = (var1 == var2 || var1 != var2); //false or true -> true
		boolean var11 = (var1 == var2 && var1 != var2); //false and false -> false
		
	}

}