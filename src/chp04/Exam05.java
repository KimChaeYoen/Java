package chp04;

public class Exam05 {

	public static void main(String[] args) {
		//�ֻ����� ���� ������ �� ���(1,2,3,4,5,6)
		//int value = ?;
		
		double temp = Math.random(); //Math.random ���� �Ǽ��� temp ������ ��´�
		
		System.out.println(temp); //[0//0�� �����ϴٴ� �Ű�,1) 1�� �������� �ʴ´�.
		System.out.println(temp * 6); //[0//0�� �����ϴٴ� �Ű�,1) 1�� �������� �ʴ´�.
		System.out.println((int)(temp * 6)); //0,1,2,3,4,5		
		System.out.println((int)(temp * 6)); //1,2,3,4,5,6		
	
		int value = (int)(temp * 6) + 1;
		
		//2�� ���� �������� 0�̶�� ���� ¦���� �̾߱�
		if(value%2 == 0) {
			System.out.println("¦���� ���Ծ��");
		}else {
			 System.out.println("Ȧ���� ���Ծ��");
		}
	}
	
}
