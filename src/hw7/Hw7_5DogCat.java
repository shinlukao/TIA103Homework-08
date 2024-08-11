package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_5DogCat {
	
	public static void main(String[] args) throws EOFException {
		
		File file = new File("C:\\data");
		
		try{
		
		FileInputStream is = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(is);
	
		
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		
		//寫無限迴圈將物件取出
			while (true) {
				//使用 instanceof 來判別物件是否為 dog 或 cat 型別，然後為了程式簡短寫 Object obj = ois.readObject;
				//而且使用ois.readObject()再下方使用會報錯
				Object obj = ois.readObject();
				if(obj instanceof Dog) 
				( (Dog) obj).speak();
				
				else 
				((Cat) obj).speak();
				
				System.out.println("--------------------");
			}
		}
			catch (EOFException e) {
				System.out.println("資料讀取完畢！");
			}
		catch(IOException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		
		} 			
	}


