package ch05;

import java.util.Arrays;

public class Exam09 {

	public static void main(String[] args) {

		//이차원 배열 만들기
		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println((scores.length));//3
		System.out.println((scores[0].length));//4
		System.out.println((scores[1].length));//5
		System.out.println((scores[2].length));//6
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			for(int k=0; k<scores[i].length;k++) {
				sum += scores[i][k];
				count ++;
			}
		}
		double avg = (double) sum/count;
		System.out.println("avg:" + avg);
	}

}
