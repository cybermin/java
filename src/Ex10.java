import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		/*
		int a0, a1, a2, a3 ;
		
		System.out.println("�Է�");
		a0 = k.nextInt();
		
		System.out.println("�Է�");
		a1 = k.nextInt();
		
		System.out.println("�Է�");
		a2 = k.nextInt();
		
		System.out.println("�Է�");
		a3 = k.nextInt();
		
		System.out.println("*** ��� ***");
		System.out.print(a0 + "\t" );
		System.out.print(a1 + "\t" );
		System.out.print(a2 + "\t" );
		System.out.print(a3 + "\t" );
		System.out.println();
		*/
		
		//�迭�� ó��
		int[] arr = new int[4];
		
		for(int i=0; i < arr.length ; i++) {
			System.out.println("���Է�");
			arr[i] = k.nextInt();
		}
		
		System.out.println("*** �迭 ��� ***");
		for(int i=0; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("*** �迭 ����� ***");
		for(int i=arr.length-1; i >= 0  ; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("*** �迭 �հ� ***");
		int sum = 0;
		for(int i=0; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		System.out.println("�հ� : " + sum) ;
		System.out.println("��� : " + (double)sum/arr.length) ;
		System.out.printf("��� : %.1f" , (double)sum/arr.length) ;
		
		System.out.println("*** �ִ밪ã�� ***");
		int max = arr[0];
		for(int i=1; i < arr.length ; i++) {
			if ( max < arr[i]) max = arr[i];
		}
		System.out.println("�ִ�� : " + max) ;
		
		System.out.println("*** �����ϱ� ***");
		for(int i= 0; i < arr.length -1; i++){
			for(int j= i+1; j < arr.length ; j++) {
				if ( arr[i] > arr[j]) {
					int temp = arr[i] ;
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		
	}

}











