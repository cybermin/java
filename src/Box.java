public class Box{
	//속성 : 멤버변수
	int w ;
	int h ;
	int d ;
	
	//생성자
	public Box(){
		w = 100 ;
		h = 200 ;
		d = 300 ;
	}
	public Box(int a){
		if (a <= 1 ) {
			w = a * 10;
			h = a * 10;
			d = a * 10;
		}
		else {
			w = a ;
			h = a ;
			d = a ;
		}
		
	}
	public Box(int w, int h, int d){
		this.w = w ;
		this.h = h ;
		this.d = d ;
	}
	
	//메소드 
	public void show() {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("높이 : " + d);
	}
	
	public int v() {
		return w * h * d ;
	}
	
	
}