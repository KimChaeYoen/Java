package ch05;

import java.util.Arrays;

public class Exam10 {

	public static void main(String[] args) {

		 int[] scores1 = {85,90,95};
		 int[] scores2 = new int[scores1.length + 2];//scores1���� 2��ŭ ���� �� �ְڴ�.
		 
		 //��ڵ尡 �ִµ� (); �����¸�.. -> �޼ҵ� ȣ��
		 //scores1��  ���� 0�ε������� scores2�� �����Ѵ�.
		 //length���̿� �����Ͽ� �����ϱ�
		 System.arraycopy(scores1, 0, scores2, 2, scores1.length);
		 
		 for(int i=0;i<scores2.length;i++) {
			 System.out.print(scores2[i] + ",");
		 }
		 
		 //��� : 85,90,95,0,0 
		 
	}

}
