package ch05homework;
import java.util.Scanner;

public class Chk09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores  = null;
		Scanner scanner = new Scanner(System.in);
	
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("--------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}
			else if(selectNo ==2) {
				for(int i=0; i<studentNum;i++) {
					System.out.println("scores["+i+"]>");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			}
			else if(selectNo ==3) {
				for(int i=0; i<studentNum;i++) {
					System.out.println("scores["+i+"]>");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			}
			else if(selectNo ==4) {
				for(int i=0; i<studentNum;i++) {
					System.out.println("scores["+i+"]>");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			}
			else if(selectNo ==5) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}