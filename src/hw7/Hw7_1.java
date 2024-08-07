package hw7;
import java.io.BufferedReader;
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
//	static void p(String s) {
//		System.out.println(s);
//	}
	public static void main(String[] args) throws IOException {
		
		File inputfile = new File("C:\\Users\\T14 Gen 3\\Desktop\\小吳 Java\\練習題組\\練習題組\\Sample.txt");
		
		FileReader in = new FileReader("C:\\Users\\T14 Gen 3\\Desktop\\小吳 Java\\練習題組\\練習題組\\Sample.txt");
		BufferedReader br = new BufferedReader(in);
		
		String c ;
		int totalcount = 0 ;
		int wordCount = 0 ;
		int j = 0;
		
		while ((c = br.readLine()) != null) { // 讀到檔案的尾端時,readline()會回傳null
			
				totalcount += c.length();
				//使用 replace ("要被取代的","取代後的")，將空格給避免計算
				wordCount += c.replace(" ","").length(); 
				
			System.out.println(c);
			System.out.flush();
			j++;
			
		}
		
		//用 read() 方法得到的會是連同，換行及空格皆納入計算
		
//		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
//			
//			System.out.print((char) c);
//			System.out.flush();
//			i++;
//			if('\n'== (char)c) {
//				j++;
//			}
//		}
		br.close();
		in.close();
		
		System.out.println();
		System.out.println("Sample.txt檔案共有多少位元：" + inputfile.length());
//		System.out.println("Sample.txt檔案共有多少位元：" + i);
		System.out.println("總共有幾列資料:" + j);
		System.out.println("字元數有幾個:"+totalcount);
		System.out.println("不含空格及換行字元數有幾個:" + wordCount);
	}
	
}
