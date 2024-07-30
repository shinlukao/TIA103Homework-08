package hw5;

import java.util.Arrays;

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳
public class Hw5_3 {

	
	public static void main(String[] args) {
		
		int[][] intArray = { {1,6,3 } , {9,5,2}};
		double[][] doubleArray = { {1.2 , 3.5 , 2.2} , {7.4 , 2.1 , 8.2}};
		Hw5_3 m = new Hw5_3();
		System.out.println(m.maxElement(intArray));
		System.out.println(m.maxElement(doubleArray));

		
		
	}
		//使用Arrays.sort(x[i])將 二維陣列進行由小到大排序
		//在new一個 getmax[][],使用getmax[i][j] = x[i][x[i].length-1]  將陣列都變成最大值
	public int maxElement(int x[][]) {
		int [][] getmax = new int [3][3];
		for(int i = 0 ; i < x.length ; i++) {
			Arrays.sort(x[i]);
			for(int j = 0 ; j< x[i].length ; j++) {
				getmax[i][j] = x[i][x[i].length-1]  ;
			}
		}
		int a = getmax[0][0];
		int b = getmax[1][0];
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public double maxElement(double x[][]) {
		double [][] getmax = new double [3][3];
		for(int i = 0 ; i < x.length ; i++) {
			Arrays.sort(x[i]);
			for(int j = 0 ; j< x[i].length ; j++) {
				getmax[i][j] = x[i][x[i].length-1]  ;

			}
		}
		double a = getmax[0][0];
		double b = getmax[1][0];
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	
}
