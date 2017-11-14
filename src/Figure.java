
public class Figure {
	int x ;
	int y ;
	double w ;
	double h ;
	String name ;
	
	public Figure(int x, int y, double w) {
		this.x = x ;
		this.y = y ;
		this.w = w ;
		this.name = "��";
	}
	public Figure(int x, int y, double w, double h) {
		this.x = x ;
		this.y = y ;
		this.w = w ;
		this.h = h ;
		this.name = "�簢��";
	}
	
	public void show() {
		System.out.println("**** "+ name + "*****");
		System.out.println("�߽� : " + x + "," + y );
		if (name.equals("��")) {
			show(w);
		}
		else {
			show(w, h);
		}
	}
	
	public void show(double w) {
		System.out.println("������ : " + w );
		System.out.println("���� : " + area(w) );
	}
	
	public void show(double w, double h) {
		System.out.println("���� : " + 2 * w );
		System.out.println("���� : " + 2 * h );
		System.out.println("���� : " + area(w, h) );
	}
	
	public double area(double w) {
		return w * w * 3.14 ;
	}
	
	public double area(double w, double h) {
		return ( 2* w ) * (2 * h) ; 
	}
}
