package hw4;
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//員工編號： 25    32    8     19     27
//身上現金：2500  800   500   1000   1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
import java.util.Scanner;

public class Hw4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int a = sc.nextInt();
		int[][] x = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; (i == 1) && (j < x[i].length); j++) {  //指定陣列只走進錢的部分
				if (x[i][j] > a) {
					System.out.print(x[0][j] + " ");
					sum++;
				}
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
