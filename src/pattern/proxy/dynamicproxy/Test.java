package pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author wangjianlou 2018年8月20日
 * @version V1.0
 */
public class Test {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("wangjanlou");
	    InvocationHandler handler = new GamePlayerHandler(player);
	    
	    IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), handler);
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
	    
    }
}
