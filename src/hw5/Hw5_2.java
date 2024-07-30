package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Hw5_2 {
	
	public static void main(String[] args) {
		System.out.println("隨機出現10個0~100(含100)的整數亂數");
		Hw5_2 randomAvg = new Hw5_2();
		randomAvg.randAvg();
	}

	public void randAvg() {
		
		int z = 10;
		int [] x = new int [z];
		int random = 1 ;
		int count = 0;
		for(int i = 0 ; i < z ; i++) {
			x[i]=random*(int)(Math.random() * 101);
			System.out.print(x[i] +" ");
			count += x[i];
		}
		System.out.println( );
		System.out.print("總數為：");
		System.out.println(count);
		System.out.print("平均為：");
		System.out.println(count / z);
	}
	
}
