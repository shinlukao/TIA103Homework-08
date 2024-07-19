package hw3;

import java.util.Scanner;

public class LotteryPro {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	public static void main(String[] args) {

		System.out.println("請輸入 1~9 不要哪個數字");
		LotteryPro lotto = new LotteryPro();
		int sum = lotto.arrayCount();
		int[] x = new int[sum];
		lotto.print(x);
		System.out.println("總共有" + sum + "個數字");
		
	

		System.out.println();
		System.out.println(x[sum-1]);
		System.out.println(x);
		System.out.println(x[(int)(Math.random()*sum)]);
	}

	
	
	public void print(int[] data) {
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != a && i % 10 != a) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public int arrayCount() {
		int count = 0;
		for (int i = 1; (i <= 49); i++) {
			if (i / 10 != a && i % 10 != a) {
				if (i >= 1) {
					count++;
				}
			}
		}
		return count;

	}
}
