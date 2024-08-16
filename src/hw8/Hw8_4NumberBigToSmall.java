package hw8;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
//請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
public class Hw8_4NumberBigToSmall {

	public static void main(String[] args) {
		
		List<Hw8_2Train> list = new ArrayList<Hw8_2Train>();

		Hw8_2Train train1 = new Hw8_2Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Hw8_2Train train2 = new Hw8_2Train(1254, "區間", "屏東", "基隆" , 700);
		Hw8_2Train train3 = new Hw8_2Train(118, "自強", "高雄", "台北", 500);
		Hw8_2Train train4 = new Hw8_2Train(1288, "區間", "新竹", "基隆", 400);
		Hw8_2Train train5 = new Hw8_2Train(122, "自強", "台中", "花蓮", 600);
		Hw8_2Train train6 = new Hw8_2Train(1222, "區間", "樹林", "七堵", 300);
		Hw8_2Train train7 = new Hw8_2Train(1254, "區間", "屏東", "基隆", 700);
		
		list.add(train1);
		list.add(train2);
		list.add(train3);
		list.add(train4);
		list.add(train5);
		list.add(train6);
		list.add(train7);
		
		//要使用 Collections.sort 或是 reserve 方法 ，需要到 Hw8_2 裡面實作 compareto 方法
		Collections.sort(list);
		Object ob;
		for(int i = 0 ; i < list.size() ; i++) {
			ob = list.get(i);
			System.out.println(ob);
		}
		
		System.out.println("===========================================");
		
		Iterator obj = list.iterator();
		while(obj.hasNext()) {
			System.out.println((Hw8_2Train)obj.next());
		}

		System.out.println("===========================================");
		
		for(Hw8_2Train train : list) {
			System.out.println(train.getNumber() +","+ train.getType() + ","+ train.getStart() +","+  train.getDest() +","+  train.getPrice());
		}
		
	}

}
