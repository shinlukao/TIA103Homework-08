package hw1;

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)

public class bank {

	public static void main(String[] args) {
	
		//FV ＝ PV×（1 ＋ R）n   次方FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
//		S = P(I + i)n
		
		double r = 0.02 ;
		double pv = 1_500_000 ;
		double n = 10 ;
		
		double xxx = Math.pow((1+r), n);
	    double fv = xxx*pv ;
		
		System.out.println("共有多少錢:" + (int)fv + "元");
		

	}

}
