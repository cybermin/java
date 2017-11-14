import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int x , y ;
		
		//두수 입력 
		System.out.println("두 수를 입력하세요.");
		x = k.nextInt();
		y = k.nextInt();
		
		//작은수 찾기
		int min ;
		if ( x < y ) min = x ;
		else min = y;
 		
		//1부터 작은 수까지 수를 두수에 나누어서 떨어지는지 확인 
		//개수 나누어지는 수 개수 구하기	
		int cnt=0;
		System.out.println("***공약수 출력***");
		for(int i=1; i<=min; i++) {
			if ( x % i == 0 && y % i == 0) {
				System.out.print(i+"\t");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("공약수의 개수 :" +cnt);
		
	}

}
