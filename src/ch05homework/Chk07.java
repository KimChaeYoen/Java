package ch05homework;

public class Chk07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1,5,3,8,2};
		//�ۼ���ġ
		for(int i=0; i<array.length;i++) {
			if(array[i]>max)
				max = array[i];
		}
		System.out.println(max);
	}

}
