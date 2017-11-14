import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int x, n ;
		x = (int)(Math.random()* 10) + 1 ;
		
		while(true) {
			System.out.println("숫자입력 :");
			n = k.nextInt();
			
			if ( x > n ) System.out.println("UP");
			else if ( x < n ) System.out.println("DOWN");
			else {
				System.out.println("OK");
				break;
			}
		}
	}

}
