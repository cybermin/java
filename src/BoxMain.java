
public class BoxMain {

	public static void main(String[] args) {
		Box b1 = new Box(2);
		Box b2 = new Box(1,2,3);
		int x ;	
		
		b1.show();
		b2.show();
		
		System.out.println("box1�� ���� : "+ b1.v());
		System.out.println("box2�� ���� : "+ b2.v());
		System.out.println("box1�� box2�� ���� �� : "+ (b1.v()+b2.v()));

	}

}
