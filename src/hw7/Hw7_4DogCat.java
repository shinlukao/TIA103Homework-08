package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)
public class Hw7_4DogCat implements Serializable {

	//因為有 implement Serializable 所以建立序列化號碼
	private static final long serialVersionUID = 2L;
	
	public static void main(String[] args) {
		
		
		try {
			//選擇資料夾路徑
			File file = new File("C:\\data");
			//建立資料夾
			file.mkdir();
			//創建兩個貓物件，及兩個狗物件
			Object dora= new Cat("dora");
			Object amon = new Cat("amon");
			Object dubi = new Dog("dubi");
			Object dubihu = new Dog("dubihu");
			
			//再定義使用 Object 類別產生一個陣列，再利用新的陣列將貓及狗物件放入
//			Object[] obj = new Object[4];
//			obj[0] = dora;
//			obj[1] = amon;
//			obj[2] = dubi;
//			obj[3] = dubihu;
		
		//將資料放入路徑完整加入
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			//使用陣列寫法，將物件寫入writeObject
//			for (int i = 0; i < obj.length; i++)
//				oos.writeObject(obj[i]);
			
			
			
			
			oos.writeObject(dora);
			oos.writeObject(amon);
			oos.writeObject(dubi);
			oos.writeObject(dubihu);
		    	
			oos.close();
			fos.close();
		
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}   
		
	}
}
