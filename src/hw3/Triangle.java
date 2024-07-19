package hw3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		if (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a + b < c || a + c < b || b + c < a) {
				System.out.println("不是三角形");
			} else if (a == b && c == a) {
				System.out.print("正三角形");
			}
			else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
					|| Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
					|| Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)) {
				System.out.print("正三角形");
			} else if (a == b || b == c || c == a) {
				System.out.print("等腰三角形");
			} else
				System.out.print("其他三角形");

		}

	}

}
