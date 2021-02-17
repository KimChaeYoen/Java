package chp04;

public class Exam09 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
		
		//do while 
		
		//boolean stop = false;
		boolean stop = false;
		int count = 0;
		//-------------------------
		do {
			System.out.println("Hello");
			count++; //1씩 더하기 해라잉   
			if(count>10) {
				stop = true;
			}
		}while(!stop);
		
		System.out.println();
		//-----------------------
		count = 0; //변수는 한번 선언하면 다시 선언할 수 없으므로 값만 바꿀 수 있음
		do{
			System.out.println("Hello");
			count++; //1씩 더하기 해라잉   
		}while(count <=10);
	}
	
}
