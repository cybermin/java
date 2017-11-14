
public class NumArrayMain {

	public static void main(String[] args) {
		int[] a = new int[10] ;
		int[] b = {23, 20, 45, 22 };
		int[] c = {1,3,2,9,5,4,8};
		
		//NumArray a1 = new NumArray(a);
		NumArray b1 = new NumArray(b);
		NumArray c1 = new NumArray(c);
		
		//a1.show();
		b1.show();
		b1.reverseShow();
		
		b1.show(c);
		System.out.println("배열의 최대값 : " + b1.max());
		System.out.println("배열의 최대값의 위치 : " + b1.position() + "번째 위치");
		System.out.println("배열의 합계 : " + b1.sum());
		b1.sort();
		
		c1.show();
		System.out.println("배열의 최대값 : " + c1.max());
		System.out.println("배열의 평균 : " + c1.avg());
		int z = 8;
		if (c1.position(z) == -1) {
			System.out.println(z + "존재하지 않습니다.");
		}
		else {
			System.out.println(z + "는 " + c1.position(z) + "번째 위치합니다.");
		}
		
	}

}
