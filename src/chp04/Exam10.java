package chp04;

public class Exam10 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
		
		//boolean stop = false;
		boolean stop = false;
		int count = 0;
		//-------------------------
		while(!stop) {
			System.out.println("Hello");
			count++; //1�� ���ϱ� �ض���   
			if(count>10) {
				stop = true;
			}
		}
		
		System.out.println();
		//-----------------------
		count = 0; //������ �ѹ� �����ϸ� �ٽ� ������ �� �����Ƿ� ���� �ٲ� �� ����
		while(count<=10) {
			System.out.println("Hello");
			count++; //1�� ���ϱ� �ض���   
			
		}
	}
	
}
