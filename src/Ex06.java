import java.util.Scanner;

//문자와 문자열 

public class Ex06 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		char c ;

		while(true) {
			System.out.print("문자입력 : ");
			//문자 입력 
			c = k.next().charAt(0);
			
			//System.out.println(c + " (ASCII)=> " + (int)c);
			
			if ( c >= 'A' && c <= 'Z' ) {
				//대문자 
				System.out.println("대문자 :" + c + " => 소문자 :"  + (char)(c + ('a' - 'A')));
			}
			else if ( c >= 'a' && c <= 'z') {
				//소문자 입력
				System.out.println("소문자 :" + c + " => 대문자 :"  + (char)(c - ('a' - 'A')));
			}
			else {
				System.out.println("입력오류");
			}
			
		}
	}

}
