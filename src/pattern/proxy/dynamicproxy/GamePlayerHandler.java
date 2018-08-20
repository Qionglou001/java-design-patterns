package pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class GamePlayerHandler implements InvocationHandler{

	private Object proxy = null;
	
	
    public GamePlayerHandler(Object proxy) {
    	this.proxy = proxy;
    }
	
	@Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("login".equals(method.getName())){
			System.out.println("开始登录...");
		}
		method.invoke(this.proxy, args);
		if("login".equals(method.getName())){
			System.out.println("登录成功...");
		}
	    return null;
    }
	
}
