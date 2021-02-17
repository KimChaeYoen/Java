package ch05;

import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
	
		//int배열 타입의 변수 arr1을 선언한다.
		//새로 객채를 만든다.
		//int 값이 3개가 들어갈 수 있는 배열을 만든다.
		
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		//String은 참조타입이고 참조타입은 기본적으로 Null을 포함한다 
		String[] arr3 = new String[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
