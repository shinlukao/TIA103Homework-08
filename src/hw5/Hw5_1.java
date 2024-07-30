package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class Hw5_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬的數值");
		int a = sc.nextInt();
		System.out.println("請輸入高的數值");
		int b = sc.nextInt();

		Hw5_1 star = new Hw5_1();
		star.starSquare(a, b);
	}

	public void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
