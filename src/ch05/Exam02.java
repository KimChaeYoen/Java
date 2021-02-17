package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		//[1]변수를 선언하면서 값 목록을 제공한 경우
		//변수의 역할은 배열의 번지를 가지고 있다 
		int[] scores1 = {90,85,95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//변수를 선언한 후 값 목록을 제공할 경우 
		int[] scores2 = null;
		scores2 = new int[] {10,20,30}; 

		//메소드 호출[1]
		//메소드 호출할때 번지가 전달하므로 call by reference임  
		add(scores1);
		add(scores2);
		//이미 변수가 선언된 상태에서 값을 지정해주는 거기때문에 new int[] 붙여줘야함
		add(new int[] {100, 200, 300});
	
	}
	
	//메소드 선언 call by reference 
	public static void add(int[] arr) {
		System.out.println("값 : " + arr);//이렇게 출력하면 번지가 출력되므로 밑에처럼 출력해야함 
		System.out.println("값 : " + Arrays.toString(arr));
	}

}
