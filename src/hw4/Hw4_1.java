//• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
package hw4;

public class Hw4_1 {
	public static void main(String[] args) {
		int sum = 0;
		double avg;
		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		avg = sum / x.length;
		System.out.println("元素平均：" + avg);
		System.out.println("大於平均數：");
		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}
	}
}
