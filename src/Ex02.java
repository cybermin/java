//���ǹ� 

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� ¦�� Ȧ���� �����ϼ���.
		//�Է�
		int x ;
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� :");
		x = k.nextInt();
		
		//ó�� �� ���
		if ( x % 2 == 0)
			System.out.println(x + "�� ¦��");
		else 
			System.out.println(x + "�� Ȧ��");
		
	}

}
