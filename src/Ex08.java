import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		String str ;
		String str2 = "";
		String str3 = "";
		
		System.out.println("���ڿ��Է� : ");
		str = k.nextLine();
		//str = k.next();
		
		/*-------------------------------------
		//�빮�� �ҹ��� 
		for(int i=0; i< str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') //�빮��
				System.out.print(cv2(str.charAt(i)));
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //�빮��
				System.out.print(cv1(str.charAt(i)));
			else 
				System.out.print(str.charAt(i));
		}
		System.out.println();
		--------------------------------------*/
		
		//��ȣȭ 
		for(int i=0; i< str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') //�빮��
				str2 = str2 + encrypt(str.charAt(i));
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //�빮��
				str2 = str2 + encrypt(str.charAt(i));
			else 
				str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		
		
		for(int i=0; i< str2.length(); i++) {
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') //�빮��
				str3 = str3 + decrypt(str2.charAt(i));
			else if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') //�빮��
				str3 = str3 + decrypt(str2.charAt(i));
			else 
				str3 = str3 + str2.charAt(i);
		}
		System.out.println(str3);
		
		
		//System.out.println(str.charAt(0) + "=>" + cv2(str.charAt(0))) ;
	}
	
	
	
	//�ҹ��� -> �빮��
	public static char cv1(char x) {
		x = (char)(x - ('a' - 'A'));
		
		return x ;
	}
	
	//�빮�� -> �ҹ���
	public static char cv2(char x) {
		x = (char)(x + ('a' - 'A'));
		
		return x ;
		}
	
	
	//��ȣȭ
	public static char encrypt(char x) {
		x = (char)(x + 2);
		
		return x ;
		}
	
	//��ȣȭ
	public static char decrypt(char x) {
		x = (char)(x - 2);
		
		return x ;
		}

}
