package TeamProject_Board;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		// �Խ���
		boolean run = true;
		//int i, j;
		//int num = 1; //��Ϲ�ȣ
		Scanner scanner = new Scanner(System.in);
		// 2���� �迭����
		String[][] boardArray = new String[100][5];
		// �Է¹��� ���� ���� String �迭 ����
		String[] scannerArr = new String[5];

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.���|2.����|3.�б�|4.����|5.����|6.����");
			System.out.println("--------------------");
			System.out.println("�޴�����:");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				// [1]��� ���
				for (int k = 0; k < boardArray.length; k++) {
					for (int p = 0; p < boardArray[k].length; p++) {
						if (boardArray[k][p] != null) {
							System.out.print(boardArray[k][p] + "\t");// �� ���
						}
					}
				}
			} else if (selectNo == 2) {
				// [2]����
				// �迭 ī��Ʈ ����
				int scCnt = 0;
				int num = 1; // ��� ��ȣ
				int eyes = 0;// ��ȸ ��

				//���� �ٷ� �̵�  
				
				String numchk = Integer.toString(num);
				scannerArr[0] = numchk;// ��ȣ �ڵ��ο�

				System.out.println("���� : "); // ���� �Է�
				scannerArr[1] = scanner.nextLine();

				System.out.println("���� : "); // ���� �Է�
				scannerArr[2] = scanner.nextLine();

				System.out.println("�۾��� : "); // �۾��� �Է�
				scannerArr[3] = scanner.nextLine();

				scannerArr[4] = Integer.toString(eyes); // ��ȸ ��

				boardArray[scCnt] = scannerArr;// �Է� ���� ���� 2���� �迭�� ����

				// �� ��� ���
				for (int k = 0; k < boardArray.length; k++) {
					for (int p = 0; p < boardArray[k].length; p++) {
						if (boardArray[k][p] != null) {
							System.out.print(boardArray[k][p] + "\t");// �� ���
						}
					}
				}

				scCnt++;
				num++;
			}

			else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {

			} else if (selectNo == 6) {
				run = false;
				System.out.println("���α׷��� ����");
			}

		}
	}

}
