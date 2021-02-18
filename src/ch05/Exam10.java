package ch05;

import java.util.Arrays;

public class Exam10 {

	public static void main(String[] args) {

		 int[] scores1 = {85,90,95};
		 int[] scores2 = new int[scores1.length + 2];//scores1보다 2만큼 값을 더 넣겠다.
		 
		 //어떤코드가 있는데 (); 이형태면.. -> 메소드 호출
		 //scores1의  값을 0인덱스부터 scores2에 복사한다.
		 //length길이에 주의하여 복사하기
		 System.arraycopy(scores1, 0, scores2, 2, scores1.length);
		 
		 for(int i=0;i<scores2.length;i++) {
			 System.out.print(scores2[i] + ",");
		 }
		 
		 //결과 : 85,90,95,0,0 
		 
	}

}
