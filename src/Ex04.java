//반복문 : 무한루프 

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		//변수 선언
		int x ;
		
		while(true){
			//변수 입력 
			System.out.println("두자리 정수 입력:");
			x = k.nextInt();
			
			//반복 종료 체크
			if ( x < 0 ) {
				System.out.println("프로그램 종료 ..");
				break;
			}
			
			
			//두자리 정수인지 확인 
			if ( x < 10 || x > 99) {
				System.out.println("[입력오류] 다시 입력");
				continue;
			}
			
			int x10 , x1 ;
			x10 = x / 10 ;
			x1 = x % 10 ;
			
			System.out.println("각자리 수 " + x10 + ", " + x1 + " 합은 " + (x10+x1));
	
		}
	}

}
