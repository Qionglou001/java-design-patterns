package pattern.factory;


public class BlackHuman implements Human{

	@Override
    public void talk() {
	    System.out.println("我是黑种人");
	    
    }

	@Override
    public void skin() {
		System.out.println("黑皮肤");
    }
	
}
