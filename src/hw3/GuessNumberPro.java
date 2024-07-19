package hw3;

import java.util.Scanner;

public class GuessNumberPro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, i = (int) (Math.random() * 101);
		System.out.println("請輸入0~100的數字:" + i);
		a = sc.nextInt();
		
		while (a != i) {
			System.out.println("猜錯囉");
			if(a<i) {
				System.out.println("你猜的值太小囉");
			}else if(a>i) {
				System.out.println("你猜的值太大囉");
			}
			a = sc.nextInt();
			continue;
		} 
		
		System.out.println("答對囉");
		
		
	}

}
