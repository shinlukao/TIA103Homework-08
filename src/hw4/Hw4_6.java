package hw4;

import java.util.Arrays;

//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數
public class Hw4_6 {

	public static void main(String[] args) {
		
        int [] student = new int[8];
        
        
		int exam[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		//因為不會備份，所以再創同一組Array
		int exam2[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		int [][] getexam= new int[6][8];
		//sort exam 陣列由小到大，並且將 getexam 的同一維的陣列都覆蓋最高分
		for (int i = 0; i < exam2.length; i++) {
			Arrays.sort(exam[i]);                  
			for (int j = 0; j < exam[i].length; j++) {
				getexam[i][j] = exam[i][exam[i].length-1]  ;
//				System.out.print(getexam[i][j] + " ") ;
//				System.out.print(exam2[i][j] + " ") ;
			}
//			System.out.println(" ");
		}
		//將getexam跟exam2 來取相同值(最高分)，並且在利用student將最高分的人做加總
		for (int i = 0; i < exam2.length; i++) {
			for (int j = 0; j < exam2[i].length; j++) {
				if( getexam[i][j] == exam2[i][j]) {
					student[j]++;
//					System.out.print((j+1) + " ");
//					System.out.print(student[j] + " ");
				
			}
//			System.out.println(" ");
		}
		}
		//將 student 陣列列印
		for (int i = 0 ; i <student.length;i++ ) {
			System.out.println((i+1)+"號"+student[i] + "次最高分");
		}
		
		
	}
}
