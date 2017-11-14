import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		String str ;
		String str2 = "";
		String str3 = "";
		
		System.out.println("문자열입력 : ");
		str = k.nextLine();
		//str = k.next();
		
		/*-------------------------------------
		//대문자 소문자 
		for(int i=0; i< str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') //대문자
				System.out.print(cv2(str.charAt(i)));
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //대문자
				System.out.print(cv1(str.charAt(i)));
			else 
				System.out.print(str.charAt(i));
		}
		System.out.println();
		--------------------------------------*/
		
		//암호화 
		for(int i=0; i< str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') //대문자
				str2 = str2 + encrypt(str.charAt(i));
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //대문자
				str2 = str2 + encrypt(str.charAt(i));
			else 
				str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		
		
		for(int i=0; i< str2.length(); i++) {
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') //대문자
				str3 = str3 + decrypt(str2.charAt(i));
			else if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') //대문자
				str3 = str3 + decrypt(str2.charAt(i));
			else 
				str3 = str3 + str2.charAt(i);
		}
		System.out.println(str3);
		
		
		//System.out.println(str.charAt(0) + "=>" + cv2(str.charAt(0))) ;
	}
	
	
	
	//소문자 -> 대문자
	public static char cv1(char x) {
		x = (char)(x - ('a' - 'A'));
		
		return x ;
	}
	
	//대문자 -> 소문자
	public static char cv2(char x) {
		x = (char)(x + ('a' - 'A'));
		
		return x ;
		}
	
	
	//암호화
	public static char encrypt(char x) {
		x = (char)(x + 2);
		
		return x ;
		}
	
	//복호화
	public static char decrypt(char x) {
		x = (char)(x - 2);
		
		return x ;
		}

}
