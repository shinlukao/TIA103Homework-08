package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryPro {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	public static void main(String[] args) {

		System.out.println("請輸入 1~9 不要哪個數字");
		LotteryPro lotto = new LotteryPro();
		int sum = lotto.arrayCount();
//		int[] x = new int[sum];
		int[] y = lotto.array();
		lotto.print(y);
//		lotto.print(x);
		System.out.println("總共有" + sum + "個數字");

		int n = 0;
		while (n < 6) {  //由y[]裡取出6個數字，並將取過得值改成"0"
			int strange = (int) ((Math.random() * sum) ) ;
			if (y[strange] != 0) {
				System.out.print(y[strange] + " ");
				y[strange] = 0;
				n++;
			}
		}

	}

	public int[] array() { // 拿到array data

		int[] data = new int[arrayCount()];
		int count = -1;
		count++;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != a && i % 10 != a) {
				data[count++] = i;
			}
		}
		return data;
	}

	public void print(int[] data) { // 印出array data
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != a && i % 10 != a) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public int arrayCount() { // 計算幾個索引值
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
