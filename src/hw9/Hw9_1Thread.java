package hw9;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//• 參考範例：CounterRunnable.java
//• 需留意主執行緒執行順序
public class Hw9_1Thread implements Runnable {

	String name;
	int counter = 0;

	// 將下面饅頭人或詹姆士加入的建構子
	public Hw9_1Thread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (counter <= 10) {
			System.out.println(name + counter);
			counter++;

			try {
				Thread.sleep(500 + (int) (Math.random() * 2501));

			} catch (Exception e) {

			} finally {
				if (counter == 11) {
					System.out.println(name + "吃完了");
				}

			}

		}

	}

	public static void main(String[] args) {
		System.out.println("========比賽開始=========");

		// 使用建構子將名子帶入
		Hw9_1Thread h1 = new Hw9_1Thread("詹姆士");
		Thread t1 = new Thread(h1);
		Hw9_1Thread h2 = new Hw9_1Thread("饅頭人");
		Thread t2 = new Thread(h2);
		t1.start();
		t2.start();

		// 使用 join 來將執行續跟 main thread 分開執行
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("========比賽結束=========");
	}

}
