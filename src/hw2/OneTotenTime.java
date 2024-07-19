package hw2;

public class OneTotenTime {
	
	public static void main(String[] args) {
		
//		//for 迴圈
//		int sum = 1;
//		for(int i = 1 ; i <= 10 ; i++) {
//			
//			sum *= i;
//			
//			
//		}
		
		//while 迴圈
		int i = 0;
		int sum = 1;
		while(i<10) {
			i++;
			sum *=i;
		}
				
		System.out.println("1~10的連乘積=" + sum );
	}
	
}
