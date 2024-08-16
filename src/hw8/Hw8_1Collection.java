package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
public class Hw8_1Collection {

	public static void main(String[] args) {
		Object obje = new Object();
		List Collection = new ArrayList();
		Collection.add(new Integer(100));
		Collection.add(new Double(3.14));
		Collection.add(new Long(21L));
		Collection.add(new Short("100"));
		Collection.add(new Double(5.1));
		Collection.add("kitty");
		Collection.add(new Integer(100));
		Collection.add(obje);
		Collection.add("Snoopy");
		Collection.add(BigInteger("1000"));

		System.out.println("toString()=" + Collection);
		System.out.println("元素個數=" + Collection.size());
		System.out.println("使用for迴圈印出元素");

		for (int i = 0; i < Collection.size(); i++) {
			Object obj = Collection.get(i);
			System.out.print(obj + " ");
		}
		System.out.println();
		System.out.println("使用Iterator印出元素");

		Iterator ite = Collection.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}

		System.out.println();
		System.out.println("使用for each 印出元素");
		for (Object xxx : Collection) {
			System.out.print(xxx + " ");
		}
		System.out.println();

		// 將 Number 以外物件移除，使用remove(),並且移除後需要i--,因為會往前遞補
		for (int i = 0; i < Collection.size(); i++) {
			if (!((Collection.get(i)) instanceof Number)) {
				Collection.remove(i);
				i--;
			} else {
//				System.out.print(Collection.get(i) + " ");
			}
		}

		System.out.println("將 Number 以外物件移除後印出");

		for (int i = 0; i < Collection.size(); i++) {
			Object obj = Collection.get(i);
			System.out.print(obj + " ");
		}

	}

	private static Object BigInteger(String string) {
		return null;
	}

}
