package hw5;

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合:
public class Hw5_5 {

	public static void main(String[] args) {
		Hw5_5 w1 = new Hw5_5();
		w1.genAuthCode();
	}
	
	public void genAuthCode() {
//此[62]代表 0~9 , a-z ,A-Z 的數量
		char[] x = new char[62];
		int j =-1;
		int k = 0;
		//使用for迴圈，將 0~z 顯示，再for迴圈裡加上 if 判斷式，將標點府號給過濾掉 
		//另外給一個 j 來取得 index
			for (char i = '\u0030'; i <= '\u007A' ; i++) {
				if((i<= '\u0039') || ((i >='\u0041') && (i<='\u005A')) || ((i >= '\u0061') && (i <= '\u007A'))) {
				j++;
				x[j] = i;
				//System.out.print(x[j] + "-");
				//打開可以看到X[]裡面個包含哪些Char
				}
				}
			//使用 while 迴圈來取得八個亂數，並且使用 x.length 這樣確保亂數皆有取到
			while(k<8) {
			int strange = (int)(Math.random()*(x.length));
				System.out.print(x[strange]);
				k++; 
			}
		}
	}


