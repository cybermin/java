
public class Ex11_main {

	public static void main(String[] args) {
		Ex11_class obj1 = new Ex11_class(10,1);
		Ex11_class obj2 = new Ex11_class(35,20);
		Ex11_class obj3 = new Ex11_class(1,4);				
		
		obj1.show();
		
		System.out.println("ū��:"+obj1.max());
		System.out.println("������:"+obj1.min());
		obj1.showNum();
		
		System.out.println();
		System.out.println("�հ�:"+obj1.sum());
		System.out.println("����:"+obj1.count());
		System.out.println("���:"+(double)obj1.sum()/obj1.count());
		
		obj2.show();
		
		System.out.println("ū��:"+obj2.max());
		System.out.println("������:"+obj2.min());
		obj2.showNum();
		/*
		int cnt = 0 ;
		System.out.println("**** ���ڸ�� ***");
		for(int i=min(); i<=max(); i++) {
			System.out.print(i + "\t");
			cnt++;
			if (cnt % 5 == 0) System.out.println(); 
		}
		System.out.println();
		System.out.println("����:"+obj2.count());
		
		obj3.showNum();
		*/
	}

}
