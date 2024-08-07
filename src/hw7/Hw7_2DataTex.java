package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)
public class Hw7_2DataTex {
	
	public static void main (String[] args) throws IOException {
		
		
		try {
	FileOutputStream fos = new FileOutputStream ("C:\\Users\\T14 Gen 3\\Desktop\\小吳 Java\\練習題組\\練習題組\\Data.txt" , true);
	
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	PrintStream ps = new PrintStream(bos);
	
	
	
	int random ;
	
	for(int i = 1 ; i<=10 ; i++) {
		random = (int)(Math.random()*1000) +1 ;
		ps.print(random + "   ");
	}
	ps.println(" ");
	ps.println("--------------------------------------------------------");
	
	
	ps.close();
	bos.close();
	fos.close();
	}
		catch (FileNotFoundException e) {
			System.err.println(e);
	}

}
}