package pattern.factory;


public class YellowHuman implements Human{

	@Override
    public void talk() {
	    System.out.println("我是黄种人");
	    
    }

	@Override
    public void skin() {
	    System.out.println("黄皮肤");
	    
    }
	
}
