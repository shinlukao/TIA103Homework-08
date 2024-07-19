package hw3;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int i = (int) (Math.random() * 10);
		
		System.out.println("請輸入0~9的數字:" + i);
		a = sc.nextInt();
		
			
			while (a != i) {
				System.out.println("猜錯囉");
				a = sc.nextInt();
				continue;
			} 
			
			System.out.println("答對囉");
	
				
			
//			a = sc.nextInt();
//			while (a == i) {
//				System.out.println("答對囉!答案就是" + i);
//				continue outer;
			}
		}

	

