package ch05;

import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
	
		//int�迭 Ÿ���� ���� arr1�� �����Ѵ�.
		//���� ��ä�� �����.
		//int ���� 3���� �� �� �ִ� �迭�� �����.
		
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		//String�� ����Ÿ���̰� ����Ÿ���� �⺻������ Null�� �����Ѵ� 
		String[] arr3 = new String[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
