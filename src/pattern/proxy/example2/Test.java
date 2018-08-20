package pattern.proxy.example2;


public class Test {
	public static void main(String[] args) {
	    GamePlayerProxy proxy = new GamePlayerProxy("王建楼");
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
    }
}
