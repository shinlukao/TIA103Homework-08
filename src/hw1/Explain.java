//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:

package hw1;

public class Explain {
	
	public static void main(String[] args) {
		
	System.out.println(5+5);
	//上述兩個5皆為 int 值
	
	System.out.println(5+'5');
	//'5' 為 unicode = 53，所以答案為 53 + 5 = 58
	
	System.out.println(5+"5");
	//"5" 為字串，所以答案為 55
	
	}
}
