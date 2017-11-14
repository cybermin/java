//반복문 : 구구단 
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//변수 선언
		int dan ;
		
		while(true){
			System.out.println("단입력(종료:0) :");
			dan = k.nextInt();
			
			if ( dan == 0 ) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if ( dan < 2 || dan > 9 ) {
				System.out.println("[입력오류]");
				continue;
			}
			
			//2~9
			for (int i = 1; i<= 9 ; i++) {
				System.out.println(dan + " x " + i + " = " + (dan*i));
			}
			
		}
		

	}

}
