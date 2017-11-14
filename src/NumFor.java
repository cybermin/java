
public class NumFor {
	int x , y ;
	
	public NumFor(int x) {
		this(x, x);
	}
	
	public NumFor(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	
	public void showDan(int x) {
		System.out.println("*** "+ x + "�� ***");
		for (int i=1 ; i<=9; i++) {
			System.out.println(x + " x " + i + " = " + (x*i));
		}
	}
	
	public void showDan() {
		if ( x == 1 )  showDan(y);
		else showDan(x);
		
	}
	
	public void showStar() {
		System.out.println("���ٷ�");
		for(int i=1; i<=this.x; i++) {
			for (int j=1; j<= y; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	public void showStar(int z) {
		System.out.println("���ٷ�2");
		for(int i=1; i<=this.x; i++) {
			for (int j=1; j<= y; j++) {
				if (i ==1 || i == x || j == 1 || j == y) 
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
	}
	public void showTriangle() {
		System.out.println("�ﰢ���ٷ�1");
		for(int i=1; i<=this.x; i++) {
			for (int j=1; j<= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	public void showTriangle(int z) {
		System.out.println("�ﰢ���ٷ�1");
		for(int i=1; i<=this.x; i++) {
			for (int j=1; j<=y-(i-1) ; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
