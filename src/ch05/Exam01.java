package ch05;

public class Exam01 {

	public static void main(String[] args) {
	
		int var1 =10;
		int var2 = 10;
		
		//����
		System.out.println(var1 == var2);
		System.out.println(var1 != var2);
		
		String var3 = "�ڹ�";
		String var4 = new String("�ڹ�"); //���ڿ��� ������
		
		//���� ��
		System.out.println(var3 == var4); //true
		System.out.println(var3 != var4); //false
		
		
		//���ڿ����� ���Ҷ�� .equals��� ���ڿ� �Լ� �Ἥ ��
		System.out.println(var3.equals(var4));

		
	}

}
