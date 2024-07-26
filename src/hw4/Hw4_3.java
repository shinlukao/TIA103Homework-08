package hw4;

import java.util.Arrays;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class Hw4_3 {

	public static void main(String[] args) {

		String[] x = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        int sum= 0;
		for (int i = 0; i < x.length; i++) { // 此x.length 為陣列引數
//		System.out.println(x[i]);
			for(int j = 0 ; j < x[i].length() ; j++) { // 此x[i[length() 為String 長度
//				System.out.print(x[i].charAt(j));
				if ((x[i].charAt(j) == 'a') || (x[i].charAt(j) == 'e') || (x[i].charAt(j) == 'i') || 
						(x[i].charAt(j) == 'o') || (x[i].charAt(j) == 'u'))
					sum++;
			}
		}
		System.out.println(sum);
	}

}
