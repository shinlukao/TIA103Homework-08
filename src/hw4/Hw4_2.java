//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)
package hw4;

public class Hw4_2 {

	public static void main(String[] args) {

		String[] s = "Hello World".split("");

		for (int i = (s.length) - 1; i >= 0; i--) {
			System.out.print(s[i].toString());
		}

	}

}
