package chp04;

public class Exam09 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
		
		//do while 
		
		//boolean stop = false;
		boolean stop = false;
		int count = 0;
		//-------------------------
		do {
			System.out.println("Hello");
			count++; //1�� ���ϱ� �ض���   
			if(count>10) {
				stop = true;
			}
		}while(!stop);
		
		System.out.println();
		//-----------------------
		count = 0; //������ �ѹ� �����ϸ� �ٽ� ������ �� �����Ƿ� ���� �ٲ� �� ����
		do{
			System.out.println("Hello");
			count++; //1�� ���ϱ� �ض���   
		}while(count <=10);
	}
	
}
