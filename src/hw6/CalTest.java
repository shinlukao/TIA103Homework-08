package hw6;
import java.util.InputMismatchException;
import java.util.Scanner;
//請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
//CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//1. x與y同時為0,(產生自訂的CalException例外物件)
//2. y為負值,而導致x的y次方結果不為整數
//3. x與y皆正確情況下,會顯示運算後結果
public class CalTest {

	public static void main(String[] args) throws InputMismatchException {
		int a;
		int b;
//	    for(int i = 0 ;i <1 ; i++) 
		int i = 0;
        // 宣告一個 while 迴圈 ，第一層放要輸入的值，並且 new 一個物件，來取得powerXY的方法
		//後續使用 catch 來 *分別*抓取兩個 exception
		//因為如果有 exception ，在顯示完異常，後要繼續回到迴圈，所以在 catch 裡加入 i--
		while (i < 1)
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值");
				a = sc.nextInt();
				System.out.println("請輸入y的值");
				b = sc.nextInt();
				Calculator c1 = new Calculator(a, b);
				c1.powerXY(a, b);
				i++;
			} catch (CalException ca) {
				System.out.println(ca.getMessage());
				i--;
			} catch (InputMismatchException imt) {

				System.out.println("輸入格式錯誤");
				i--;
			}

	}
}
