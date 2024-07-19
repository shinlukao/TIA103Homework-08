package hw2;

public class Lotto {

	public static void main(String[] args) {
		int i;
		int count = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 != 4) {
				if (i / 10 != 4) {
					System.out.print(i + " ");

					if (i >= 1) {
						count++;
					}
				}
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個號碼可選擇");
	}

}
