//자바 입출력 

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
				
		//출력
		System.out.println("[사칙연산 프로그램]");
		
		//입력
		Scanner k = new Scanner(System.in);
		
		//입력변수 선언
		int x , y ; 	//정수저장 
				
		//변수값 입력
		System.out.println("두정수를 입력하세요.");
		System.out.print("첫번째 정수 : ");
		x = k.nextInt();
		System.out.print("두번째 정수 : ");
		y = k.nextInt();
		
		System.out.println("[결과]");
		System.out.println( x + " + " + y + " = " + (x+y)) ;
		System.out.println( x + " - " + y + " = " + (x-y)) ;
		System.out.println( x + " x " + y + " = " + (x*y)) ;
		System.out.println( x + " / " + y + " = " + ((double)x/y)) ;
		
	}

}
