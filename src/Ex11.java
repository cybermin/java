import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int x , y ;
		
		//�μ� �Է� 
		System.out.println("�� ���� �Է��ϼ���.");
		x = k.nextInt();
		y = k.nextInt();
		
		//������ ã��
		int min ;
		if ( x < y ) min = x ;
		else min = y;
 		
		//1���� ���� ������ ���� �μ��� ����� ���������� Ȯ�� 
		//���� ���������� �� ���� ���ϱ�	
		int cnt=0;
		System.out.println("***����� ���***");
		for(int i=1; i<=min; i++) {
			if ( x % i == 0 && y % i == 0) {
				System.out.print(i+"\t");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("������� ���� :" +cnt);
		
	}

}
