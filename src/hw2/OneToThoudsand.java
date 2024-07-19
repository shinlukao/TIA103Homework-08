package hw2;

public class OneToThoudsand {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
//				System.out.print(i);
//				System.out.println();
				sum += i;
				
				
			}
			
		}
		System.out.print("1~1000 的偶數和=" + sum);
	}

}
