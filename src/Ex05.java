//�ݺ��� : ������ 
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//���� ����
		int dan ;
		
		while(true){
			System.out.println("���Է�(����:0) :");
			dan = k.nextInt();
			
			if ( dan == 0 ) {
				System.out.println("���α׷� ����");
				break;
			}
			
			if ( dan < 2 || dan > 9 ) {
				System.out.println("[�Է¿���]");
				continue;
			}
			
			//2~9
			for (int i = 1; i<= 9 ; i++) {
				System.out.println(dan + " x " + i + " = " + (dan*i));
			}
			
		}
		

	}

}
