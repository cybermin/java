//반복문 

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 작은 수에서 큰수까지 입력하세요.
		//입력
		int x, y;
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		x = k.nextInt();
		System.out.print("숫자 입력 :");
		y = k.nextInt();
		
		//큰수 작은 정하기
		if ( x > y ) {
			int temp = x;
			x = y ;
			y = temp ;		
		}
		
		// 출력 : 한줄에 5개씩 출력
		int cnt = 0; //개수 
		int sum = 0; //합계
		for(int i=x; i<=y; i++){
			System.out.print(i + "\t");
			sum = sum + i;
			cnt++ ;
			if ( cnt % 5 == 0 ) System.out.println();
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ((double)sum / cnt));
	}

}
