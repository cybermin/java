//조건문 

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 정수를 입력받아서 짝수 홀수를 구분하세요.
		//입력
		int x ;
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		x = k.nextInt();
		
		//처리 및 출력
		if ( x % 2 == 0)
			System.out.println(x + "는 짝수");
		else 
			System.out.println(x + "는 홀수");
		
	}

}
