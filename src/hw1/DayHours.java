//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

package hw1;

public class DayHours {
	
	public static void main(String[] args) {
		final int subject = 256559 ; 
		int seconds = subject % 60 ;
		int minutes = (subject / 60) % 60 ;
		int hours = (subject/ 3600)%24;
		int days = (subject/ (60*60*24));
		
		System.out.print("256559秒換算結果為："+days+"天" +hours+ "時"+minutes + "分" + seconds + "秒");
		
	}

}
