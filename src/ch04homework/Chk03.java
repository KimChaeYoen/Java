package ch04homework;


public class Chk03 {

	public static void main(String[] args) throws Exception {
		
		//for문을 이용해서 1부터 100가지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성하라
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3 ==0) sum +=i;
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
