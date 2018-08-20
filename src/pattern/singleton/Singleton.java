package pattern.singleton;

/**
 * 单例模式双重锁机制
 * @author wangjianlou 2018年8月20日
 * @version V1.0
 */
public class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
					return singleton;
				}
			}
		}
		return singleton;
	}
}
