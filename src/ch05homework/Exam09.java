package ch05homework;

public class Exam09 {

	public static void main(String[] args) {
	
		//System.arraycopy()로 배열 복사  
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		
		for(int i =0; i< newStrArray.length;i++) {
			System.out.print(newStrArray[i]+",");
		}
	}	
}

