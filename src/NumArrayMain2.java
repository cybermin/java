import java.util.Scanner;

public class NumArrayMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		while(true) {
			System.out.println("숫자의 개수를 입력하세요=>");
			int n = k.nextInt();
			
			if ( n <= 0 ) {
				System.out.println("프로그램종료");
				break;
			}
			
			int[] narr = new int[n];
			for(int i=0; i<narr.length; i++) {
				System.out.println((i+1)+"번째 숫자입력=>");
				narr[i] = k.nextInt();
			}
			
			NumArray na = new NumArray(narr);
			na.show();
			System.out.println("배열의 최대값 : " + na.max());
			System.out.println("배열의 최대값의 위치 : " + na.position() + "번째 위치");
			System.out.println("배열의 합계 : " + na.sum());
			System.out.println("배열의 정렬");
			na.show(na.sort());
			
			System.out.println("찾을 숫자를 입력하세요.");
			int num = k.nextInt();
			if (na.position(num) == -1) {
				System.out.println(num + "존재하지 않습니다.");
			}
			else {
				System.out.println(num + "는 " + na.position(num) + "번째 위치합니다.");
			}
			
		}

	}

}
