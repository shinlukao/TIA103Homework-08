package hw6;

import java.util.InputMismatchException;

//請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
//CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//1. x與y同時為0,(產生自訂的CalException例外物件)
//2. y為負值,而導致x的y次方結果不為整數
//3. x與y皆正確情況下,會顯示運算後結果
public class Calculator {

	private int x;
	private int y;

	public Calculator() {};
    //建立物件時使用建構子得到 x y , 所以直接給 private 的 x y ，再由後續方法卡控
	public Calculator(int x, int y) throws CalException {
	this.x=x;
	this.y=y;
	}
	//使用 powerXY 方法，裡面按照老師要求進行 if else 卡控，如果都沒被攔截，即可得到 x 的 y 次方結果
	public void powerXY(int x, int y)  throws CalException {
		
		if ((x == 0) && (y == 0)) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else {
			System.out.println(x +"的" + y + "次方等於" + Math.pow(x, y));
		}
		}

	public void setCalculator(int x, int y) throws CalException {

		if (((x >= 0) || (x < 0)) && (y > 0)) {
			this.x = x;
			this.y = y;
		} else if ((x == 0) && (y == 0)) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else {
			System.out.println("輸入格式不正確");
		}
	}

	public int getxCalculator() {
		return x;
	}

	public int getyCalculator() {
		return y;
	

	

}
}
