package chp04;

public class Exam04 {

	public static void main(String[] args) {
		
		char grad = 'D';
		
		switch(grad) {
		case 'A':
			System.out.println("Ŀ�Ǹ� �����մϴپ�.");
			//break;
		case 'B':
			System.out.println("���� 1�ϳ��� �ݴϴ�.");
			break;
		case 'C':
			System.out.println("�λ縸 �մϴ�.");
			break;
		default:
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
		
		
		//-----------------------------------
		
		if(grad == 'A'){
			System.out.println("Ŀ�Ǹ� �����մϴپ�.");
			System.out.println("���� �ϳ��� �ݴψ�");
		}else if(grad == 'B') {
			System.out.println("���� �ϳ��� �ݴϴ���");	
		}else if(grad == 'C') {
			System.out.println("�λ縸 �մϴ���");
		}else {
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
			
		
	}

}
