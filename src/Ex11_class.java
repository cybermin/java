
public class Ex11_class {
	//�Ӽ� 
	int x, y ;
	
	//������ 
	public Ex11_class(int x, int y){
		this.x = x ;
		this.y = y ;
	}
			
	//�޼ҵ�
	public void show() {
		System.out.println("x = " + x + ", y=" + y);
	}
	
	public int max(){
		if (x > y ) return x;
		else return y;
	}
	
	public int min(){
		if (x < y ) return x;
		else return y;
		 
	}
	
	
	public void showNum() {
		int cnt = 0 ;
		System.out.println("**** ���ڸ�� ***");
		for(int i=min(); i<=max(); i++) {
			System.out.print(i + "\t");
			cnt++;
			if (cnt % 5 == 0) System.out.println(); 
		}
		System.out.println();
	}
	
	public int sum(){
		int s = 0 ;
		for (int i=min(); i<=max(); i++) {
			s = s + i;
		}
		
		return s;
	}
	
	public int count() {
		int cnt = 0 ;
		for (int i=min(); i<=max(); i++) {
			cnt++;
		}
		
		return cnt;
	}
}
