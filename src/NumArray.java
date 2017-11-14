
public class NumArray {
	int arr[] ;
	
	public NumArray(int[] arr) {
		this.arr = arr;
	}
	
	public void show() {
		System.out.println("** 배열 출력 **");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i+1)%5 ==0 ) System.out.println();
		}
		System.out.println();
	}
	
	public void show(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i+1)%5 ==0 ) System.out.println();
		}
		System.out.println();
	}
	
	public void reverseShow() {
		int cnt = 0;
		System.out.println("** 배열 역출력 **");
		for(int i=arr.length - 1; i>=0 ; i--) {
			System.out.print(arr[i] + "\t");
			cnt++;
			if (cnt % 5 ==0 ) System.out.println();
		}
		System.out.println();
	}
	
	public int max() {
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if ( max < arr[i]) max = arr[i] ;
		}
		return max;
	}
	
	public double avg() {
		return (double)sum() / arr.length ;
	}
	public int sum() {
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public int position() {
		int idx = position(max()); 
		return idx ;
	}
	
	public int position(int x) {
		int idx = -1;
		
		for(int i=0; i<arr.length; i++) {
			if ( x == arr[i] ){
				idx = i+1 ;
				break;
			}
		}
		
		return idx;
	}
	
	public int[] sort() {
		//int[] sarr = new int[arr.length];
		int[] sarr = arr ;
		
		for(int i=0; i<sarr.length-1; i++) {
			for(int j=i+1; j<sarr.length; j++){
				if ( sarr[i] > sarr[j]) {
					int temp = sarr[i];
					sarr[i] = sarr[j];
					sarr[j] = temp ;
				}
			}
		}
		
		return sarr;
	}
}
