import java.util.Scanner;

public class NumArrayMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		while(true) {
			System.out.println("������ ������ �Է��ϼ���=>");
			int n = k.nextInt();
			
			if ( n <= 0 ) {
				System.out.println("���α׷�����");
				break;
			}
			
			int[] narr = new int[n];
			for(int i=0; i<narr.length; i++) {
				System.out.println((i+1)+"��° �����Է�=>");
				narr[i] = k.nextInt();
			}
			
			NumArray na = new NumArray(narr);
			na.show();
			System.out.println("�迭�� �ִ밪 : " + na.max());
			System.out.println("�迭�� �ִ밪�� ��ġ : " + na.position() + "��° ��ġ");
			System.out.println("�迭�� �հ� : " + na.sum());
			System.out.println("�迭�� ����");
			na.show(na.sort());
			
			System.out.println("ã�� ���ڸ� �Է��ϼ���.");
			int num = k.nextInt();
			if (na.position(num) == -1) {
				System.out.println(num + "�������� �ʽ��ϴ�.");
			}
			else {
				System.out.println(num + "�� " + na.position(num) + "��° ��ġ�մϴ�.");
			}
			
		}

	}

}
