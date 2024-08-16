package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
public class Hw_8_5NumberBigToSmallNotTheSame {

	public static void main(String[] args) {
		
		Set<Hw8_2Train> set = new TreeSet<Hw8_2Train>();

		Hw8_2Train train1 = new Hw8_2Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Hw8_2Train train2 = new Hw8_2Train(1254, "區間", "屏東", "基隆" , 700);
		Hw8_2Train train3 = new Hw8_2Train(118, "自強", "高雄", "台北", 500);
		Hw8_2Train train4 = new Hw8_2Train(1288, "區間", "新竹", "基隆", 400);
		Hw8_2Train train5 = new Hw8_2Train(122, "自強", "台中", "花蓮", 600);
		Hw8_2Train train6 = new Hw8_2Train(1222, "區間", "樹林", "七堵", 300);
		Hw8_2Train train7 = new Hw8_2Train(1254, "區間", "屏東", "基隆", 700);
		
		set.add(train1);
		set.add(train2);
		set.add(train3);
		set.add(train4);
		set.add(train5);
		set.add(train6);
		set.add(train7);
		
		//能印出不重複的方法是因為在 Hw8_2 裡面的 compare方法裡有加入   if (this.number == train.number){return 0;
		
		Iterator obj = set.iterator();
		while(obj.hasNext()) {
			System.out.println((Hw8_2Train)obj.next());
		}

		 
		for(Hw8_2Train train : set) {
			System.out.println(train.getNumber() +","+ train.getType() + ","+ train.getStart() +","+  train.getDest() +","+  train.getPrice());
		}
		
	}

}
