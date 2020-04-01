
public class Sample {
	
	private static int[] arrInt = new int[5];
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			arrInt[i] = i;
		}
		atLast();
		System.out.println();
		atFirst();
	}
	private static void atFirst() {
		boolean isFirst = true;
		for(int i : arrInt) { // for each 문 쓰는 습관 들이기
			if(isFirst) {
				isFirst = false;
			}else {
				System.out.print(", ");
			}
			System.out.print(arrInt[i]);
		}
	}
	private static void atLast() {
		for(int i = 0; i < 5; i++) {
			System.out.print(arrInt[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}
	}
}
