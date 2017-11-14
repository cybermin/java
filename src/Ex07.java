import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//문자열 선언
		String str ;

		//문자열 입력
		System.out.println("문자열을 입력하세요.");
		//str = k.nextLine();
		str = k.next();
		
		//문자열에 포함된 문자 출력
		//length() 메소드는 해당 문자의 개수를 알려줌 
		System.out.println(str);
		for(int i=0 ; i< str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
