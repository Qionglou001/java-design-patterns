package threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadLocalTest {
	private ThreadLocal<ThreadLocalTest.User> threadLocalUser = new ThreadLocal<ThreadLocalTest.User>();

	public ThreadLocalTest(ThreadLocalTest.User user){
		this.threadLocalUser.set(user);
	}
	
	public ThreadLocalTest() {
		
    }

	public static class User{
		private String userName;
		private String password;
		
        public String getUserName() {
        	return userName;
        }
		
        public void setUserName(String userName) {
        	this.userName = userName;
        }
		
        public String getPassword() {
        	return password;
        }
		
        public void setPassword(String password) {
        	this.password = password;
        }
	}
	
	public void print(){
		if(threadLocalUser.get() == null){
			System.out.println("null");
			return;
		}
		System.out.println(threadLocalUser.get().getUserName());
		System.out.println(threadLocalUser.get().getPassword());
	}
	
	public static void main(String[] args) {
		ThreadLocalTest.User user = new ThreadLocalTest.User();
		user.setUserName("wangjianlou");
		user.setPassword("123456");
		ThreadLocalTest threadLocalUser = new ThreadLocalTest(user);
		
		ExecutorService pool = Executors.newCachedThreadPool();
		pool.execute(new Runnable() {
			@Override
			public void run() {
				threadLocalUser.print();
			}
		});
		
		pool.submit(new Runnable() {
			@Override
			public void run() {
				ThreadLocalTest threadLocalUser = new ThreadLocalTest(user);
				threadLocalUser.print();
			}
		});
		pool.shutdown();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				threadLocalUser.print();
			}
		}).start();
		
		try {
	        Thread.sleep(2000);
        } catch (InterruptedException e) {
	        e.printStackTrace();
        }
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadLocalTest threadLocalUser = new ThreadLocalTest(user);
				threadLocalUser.print();
			}
		}).start();
    }
}
