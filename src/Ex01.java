//�ڹ� ����� 

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
				
		//���
		System.out.println("[��Ģ���� ���α׷�]");
		
		//�Է�
		Scanner k = new Scanner(System.in);
		
		//�Էº��� ����
		int x , y ; 	//�������� 
				
		//������ �Է�
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("ù��° ���� : ");
		x = k.nextInt();
		System.out.print("�ι�° ���� : ");
		y = k.nextInt();
		
		System.out.println("[���]");
		System.out.println( x + " + " + y + " = " + (x+y)) ;
		System.out.println( x + " - " + y + " = " + (x-y)) ;
		System.out.println( x + " x " + y + " = " + (x*y)) ;
		System.out.println( x + " / " + y + " = " + ((double)x/y)) ;
		
	}

}
