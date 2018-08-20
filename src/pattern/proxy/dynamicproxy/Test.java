package pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("王建楼");
	    InvocationHandler handler = new GamePlayerHandler(player);
	    
	    IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), handler);
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
	    
    }
}
