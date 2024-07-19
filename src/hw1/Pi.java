//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

package hw1;

public class Pi {
	
	public static void main (String[] args) {
		
		final double PI = 3.1415 ;
		double r = 5 ;
		double circle_area = r * r * PI ;
		double circumference = 2*PI*r;
		
		
		System.out.printf("圓面積:%.2f%n" , circle_area);
//		System.out.printf("%.2f%n" , circle_area);
		System.out.printf("圓周長:%.2f%n" , circumference);
		
	}

}
