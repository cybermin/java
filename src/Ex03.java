//�ݺ��� 

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// ���� ������ ū������ �Է��ϼ���.
		//�Է�
		int x, y;
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� :");
		x = k.nextInt();
		System.out.print("���� �Է� :");
		y = k.nextInt();
		
		//ū�� ���� ���ϱ�
		if ( x > y ) {
			int temp = x;
			x = y ;
			y = temp ;		
		}
		
		// ��� : ���ٿ� 5���� ���
		int cnt = 0; //���� 
		int sum = 0; //�հ�
		for(int i=x; i<=y; i++){
			System.out.print(i + "\t");
			sum = sum + i;
			cnt++ ;
			if ( cnt % 5 == 0 ) System.out.println();
		}
		System.out.println();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + ((double)sum / cnt));
	}

}
