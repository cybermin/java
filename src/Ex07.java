import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//���ڿ� ����
		String str ;

		//���ڿ� �Է�
		System.out.println("���ڿ��� �Է��ϼ���.");
		//str = k.nextLine();
		str = k.next();
		
		//���ڿ��� ���Ե� ���� ���
		//length() �޼ҵ�� �ش� ������ ������ �˷��� 
		System.out.println(str);
		for(int i=0 ; i< str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
