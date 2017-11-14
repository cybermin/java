
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
		this.name = "원";
	}
	public Figure(int x, int y, double w, double h) {
		this.x = x ;
		this.y = y ;
		this.w = w ;
		this.h = h ;
		this.name = "사각형";
	}
	
	public void show() {
		System.out.println("**** "+ name + "*****");
		System.out.println("중심 : " + x + "," + y );
		if (name.equals("원")) {
			show(w);
		}
		else {
			show(w, h);
		}
	}
	
	public void show(double w) {
		System.out.println("반지름 : " + w );
		System.out.println("면적 : " + area(w) );
	}
	
	public void show(double w, double h) {
		System.out.println("가로 : " + 2 * w );
		System.out.println("세로 : " + 2 * h );
		System.out.println("면적 : " + area(w, h) );
	}
	
	public double area(double w) {
		return w * w * 3.14 ;
	}
	
	public double area(double w, double h) {
		return ( 2* w ) * (2 * h) ; 
	}
}
