package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//代表的檔案會複製到第二個參數代表的檔案
public class Hw7_3CopyFile {
	
	public static void main(String[] args) {
		
		Hw7_3CopyFile cp = new Hw7_3CopyFile();
		//呼叫copyFile方法，將a檔案複製到b檔案
		cp.copyFile("C:\\TIA103_Workspace\\Homework1.pdf", "C:\\TIA103_Workspace\\2.pdf");
	}
	//建立copyFile方法，將a檔案複製到b檔案
	public void copyFile(String x , String y){
		//file in & out 皆由 file-->inputstream-->bufferinputstream 路徑接管子
		try {
			File inputXFile = new File(x);
			FileInputStream fis = new FileInputStream(inputXFile);
			BufferedInputStream br = new BufferedInputStream(fis);
			
			
			File outputYFile = new File(y);
			FileOutputStream fos = new FileOutputStream(outputYFile);
			BufferedOutputStream bw = new BufferedOutputStream(fos);
			
			int c;
			int i = 0;
			//使用byte陣列,陣列裡的大小為input的檔案大小
			byte ch[] = new byte[(int) inputXFile.length()];
			//當在 BufferedInputStream 裡讀到檔案 != -1 , 迴圈繼續執行
			while ((c = br.read()) != -1) {
			//將	BufferedOutputStream 從a檔寫入b檔
				bw.write(c);
				bw.flush();
//				ch[i++] = (byte) c;
			}
//			System.out.print(new String(ch));
			
			bw.close();
			fos.close();
			br.close();
			fis.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
