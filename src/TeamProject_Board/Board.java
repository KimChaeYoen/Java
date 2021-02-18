package TeamProject_Board;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		// 게시판
		boolean run = true;
		//int i, j;
		//int num = 1; //목록번호
		Scanner scanner = new Scanner(System.in);
		// 2차원 배열생성
		String[][] boardArray = new String[100][5];
		// 입력받은 값을 담을 String 배열 선언
		String[] scannerArr = new String[5];

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.목록|2.생성|3.읽기|4.수정|5.삭제|6.종료");
			System.out.println("--------------------");
			System.out.println("메뉴선택:");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				// [1]목록 출력
				for (int k = 0; k < boardArray.length; k++) {
					for (int p = 0; p < boardArray[k].length; p++) {
						if (boardArray[k][p] != null) {
							System.out.print(boardArray[k][p] + "\t");// 열 출력
						}
					}
				}
			} else if (selectNo == 2) {
				// [2]생성
				// 배열 카운트 생성
				int scCnt = 0;
				int num = 1; // 목록 번호
				int eyes = 0;// 조회 수

				//다음 줄로 이동  
				
				String numchk = Integer.toString(num);
				scannerArr[0] = numchk;// 번호 자동부여

				System.out.println("제목 : "); // 제목 입력
				scannerArr[1] = scanner.nextLine();

				System.out.println("내용 : "); // 내용 입력
				scannerArr[2] = scanner.nextLine();

				System.out.println("글쓴이 : "); // 글쓴이 입력
				scannerArr[3] = scanner.nextLine();

				scannerArr[4] = Integer.toString(eyes); // 조회 수

				boardArray[scCnt] = scannerArr;// 입력 받은 값을 2차원 배열에 저장

				// 글 목록 출력
				for (int k = 0; k < boardArray.length; k++) {
					for (int p = 0; p < boardArray[k].length; p++) {
						if (boardArray[k][p] != null) {
							System.out.print(boardArray[k][p] + "\t");// 열 출력
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
				System.out.println("프로그램을 종료");
			}

		}
	}

}
