package ch02;

public class Exam02 {

	public static void main(String[] args) {
		
		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10; //1����Ʈ
		int var2 = var1;//1����Ʈ�� 4����Ʈ�� ���� ����
		//System.out.println("var2: " + var2);
		
		//���� Ÿ�� ��ȯ
		int var3 = 1000;//4����Ʈ
		//�ɰ��� ������ byte������ �ɰ��� ���� �� �������� �ִ� ���� �����Ұ���.
		byte var4 = (byte)var3; // 4����Ʈ�� 1����Ʈ�� ���� ���� 
		//System.out.println("var4: " + var4);
		
		//---------------------------------
		
		//�ڵ� Ÿ�� ��ȯ(������ �Ǽ����� �׻����� ����)
		long var5 = 10;
		double var6 = var5;//������ �Ǽ��� �ִ°��� ������ ������
		
		//���� Ÿ�� ��ȯ (�Ǽ��� �������� �׻� ū ����)
		float var7 = 10.5f;
		long var8 = (long)var7;// �Ǽ�Ÿ���� ����Ÿ������ �ٲ���� �� �����Ƿ�..���� ����ȯ
		
		//-------------------------------------
		
		//�Ǽ��� ������ ��ȯ
		double var9 = 3.14;
		int var10 = (int)var9;
		System.out.println("var10 : " + var10);
		
	}

}
