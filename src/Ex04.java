//�ݺ��� : ���ѷ��� 

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//���� ����
		int x ;
		
		while(true){
			//���� �Է� 
			System.out.println("���ڸ� ���� �Է�:");
			x = k.nextInt();
			
			//�ݺ� ���� üũ
			if ( x < 0 ) {
				System.out.println("���α׷� ���� ..");
				break;
			}
			
			
			//���ڸ� �������� Ȯ�� 
			if ( x < 10 || x > 99) {
				System.out.println("[�Է¿���] �ٽ� �Է�");
				continue;
			}
			
			int x10 , x1 ;
			x10 = x / 10 ;
			x1 = x % 10 ;
			
			System.out.println("���ڸ� �� " + x10 + ", " + x1 + " ���� " + (x10+x1));
	
		}
	}

}
