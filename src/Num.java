
public class Num {
	private int x ;
	private int y ;
	
	public Num(){
		this(0, 10);
	}
	
	public Num(int x){
		this(x, x*2);
	}
	
	public Num(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void set() {
		set(0,0);
	}
	
	public void set(int x) {
		set(x, 2*x);
	}
	
	public void set(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void show() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		showFor();
	}
	
	private void showFor() {
		int cnt = 0;
		for (int i=1; i<=x; i++) {
			System.out.print(i + "\t");
			cnt++;
			if (cnt % 5 == 0) System.out.println();
		}
		System.out.println();
	}
	
	public int sum(){
		int sum = 0 ;
		for (int i=1; i<=x; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public int count(){
		int sum = 0 ;
		for (int i=1; i<=x; i++) {
			sum++;
		}
		return sum;
	}
}
