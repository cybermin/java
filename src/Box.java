public class Box{
	//�Ӽ� : �������
	int w ;
	int h ;
	int d ;
	
	//������
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
	
	//�޼ҵ� 
	public void show() {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + d);
	}
	
	public int v() {
		return w * h * d ;
	}
	
	
}