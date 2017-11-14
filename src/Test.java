
public class Test {

	public static void main(String[] args) {
		int x = 10 , y =20 ;

		x = y ;
		System.out.println(x);
		
		x = method1();
		System.out.println(x);
	}
	
	public static int method1() {
		int x = 100; 
		return x;
	}

}
