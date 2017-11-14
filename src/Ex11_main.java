
public class Ex11_main {

	public static void main(String[] args) {
		Ex11_class obj1 = new Ex11_class(10,1);
		Ex11_class obj2 = new Ex11_class(35,20);
		Ex11_class obj3 = new Ex11_class(1,4);				
		
		obj1.show();
		
		System.out.println("큰수:"+obj1.max());
		System.out.println("작은수:"+obj1.min());
		obj1.showNum();
		
		System.out.println();
		System.out.println("합계:"+obj1.sum());
		System.out.println("개수:"+obj1.count());
		System.out.println("평균:"+(double)obj1.sum()/obj1.count());
		
		obj2.show();
		
		System.out.println("큰수:"+obj2.max());
		System.out.println("작은수:"+obj2.min());
		obj2.showNum();
		/*
		int cnt = 0 ;
		System.out.println("**** 숫자목록 ***");
		for(int i=min(); i<=max(); i++) {
			System.out.print(i + "\t");
			cnt++;
			if (cnt % 5 == 0) System.out.println(); 
		}
		System.out.println();
		System.out.println("개수:"+obj2.count());
		
		obj3.showNum();
		*/
	}

}
