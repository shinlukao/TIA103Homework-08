//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

package hw1;

public class EggCount {
	
	public static void main (String[] args) {
		
		int num1 = 200 /12;
		int num2 = 200 % 12;
		
		System.out.println("總共幾打：" + num1);
		System.out.println("幾顆：" + num2);
		
	}

}
