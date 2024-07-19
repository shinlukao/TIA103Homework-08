package hw2;

public class TestNineNine {

	public static void main(String[] args) {

//		//for + while 迴圈
//		for (int i = 1 ; i <=9 ; i++) {
//			int j = 0;
//			while (j < 9) {
//				j++;
//				System.out.print( i +"*" + j + "=" + (i * j) + ("\t") );
//			}
//				System.out.println();
//		}

//		// for + do while 迴圈
//		for (int i = 1; i <= 9; i++) {
//			int j = 0;
//			do {
//				j++;
//				System.out.print(i + "*" + j + "=" + (i * j) + ("\t"));
//
//			} while (j < 9);
//                System.out.println ();
//		}
		
		// while + do while 迴圈
		int i =0;
		while (i<9) {
			i++;
		int j = 0;	
		do {
			j++;
			System.out.print(i + "*" + j + "=" + (i * j) + ("\t"));
		} while (j<9);
		 System.out.println ();
		}

	}

}
