package socket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {
	
	public static void main(String[] args) {
		SocketHttpClient client = new SocketHttpClient();
		client.start("www.baidu.com", 80);
		ExecutorService executors = Executors.newFixedThreadPool(10);
		Runnable run = new Runnable() {
			@Override
			public void run() {
				new SocketHttpClient().start("www.baidu.com", 80);
			}
		};
		executors.execute(run);
	}
}
