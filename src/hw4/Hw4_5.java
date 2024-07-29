package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
public class Hw4_5 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年份");
		int a = sc.nextInt();
		int fourArray[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		int otherArray [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int foursum = 0;
		int nonefoursum = 0;
	
		
		OUTER1: //判斷年份有無正確
		while (a<0) {
			System.out.println("!!!請輸入正確年份!!!");
			a = sc.nextInt();
			continue OUTER1;
		}
		
		System.out.println("請輸入月份");
		int b = sc.nextInt();
		
		
		
		OUTER2://判斷月份有無正確
		while (b<0 || b>12) {
			System.out.println("!!!請輸入正確月份!!!");
			b = sc.nextInt();
			continue OUTER2;
		}
		
		System.out.println("請輸入幾號");
		int c = sc.nextInt();
		
		
		
		
		OUTER3://判斷日期有無正確
			while (c<0 ||   ((a % 4 != 0) && (b== 2) && (c>28))  ||  (((a%4 == 0) &&(b==2) && (c>29)))  ||
				  ((b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12)	&& (c>31))    || 
					((b==4 || b==6 || b==9 || b==11) && (c>30))) {
				
				System.out.println("!!!請輸入正確日期!!!");
				c = sc.nextInt();
				continue OUTER3 ;
			}
		
		//印出非閏年的天數
		
		if( a % 4 != 0) {
			for(int i = 0 ; i <b ; i++ ){
				nonefoursum=otherArray[i] + nonefoursum;						
			}
		System.out.println("輸入的日期為該年第" + (nonefoursum+c) );
		}
		
		//印出閏年的天數
		if( a % 4 == 0) {
			for(int i = 0 ; i <b ; i++ ){
				foursum=fourArray[i] + foursum;						
			}
		System.out.println("輸入的日期為該年第" + (foursum+c) );
		}
	}
}
		
		
		
		
	

