package hw3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入 1~9 不要哪個數字");
		int a = sc.nextInt(); // 輸入不要的數字;
		int j = 0;

		for (int i = 1; i <= 49; i++) {
			if (i / 10 != a) {
				if (i % 10 != a) {
					System.out.print(i + " ");
					if (i >= 1) {
						j++;
					}
				}
			}
		}
		System.out.println();
		System.out.println("總共有" +j +"數可以選");	
	}

}
