
public class NumMain {

	public static void main(String[] args) {
		Num n1 = new Num();
		Num n2 = new Num(20);
		Num n3 = new Num(30, 300);

		n1.show();
		n1.set();
		System.out.println("x = " + n1.getX());
		
		
		/*
		n1.show();	
		n1.showFor();
		System.out.println("�հ� :" + n1.sum());
		
		n2.show();
		n2.showFor();
		System.out.println("���� :" + n2.count());
		
		n3.show();
		n3.showFor();
		System.out.println("��� :" + (double)n3.sum()/n3.count());
		*/
	}

}
