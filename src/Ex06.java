import java.util.Scanner;

//���ڿ� ���ڿ� 

public class Ex06 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		char c ;

		while(true) {
			System.out.print("�����Է� : ");
			//���� �Է� 
			c = k.next().charAt(0);
			
			//System.out.println(c + " (ASCII)=> " + (int)c);
			
			if ( c >= 'A' && c <= 'Z' ) {
				//�빮�� 
				System.out.println("�빮�� :" + c + " => �ҹ��� :"  + (char)(c + ('a' - 'A')));
			}
			else if ( c >= 'a' && c <= 'z') {
				//�ҹ��� �Է�
				System.out.println("�ҹ��� :" + c + " => �빮�� :"  + (char)(c - ('a' - 'A')));
			}
			else {
				System.out.println("�Է¿���");
			}
			
		}
	}

}
