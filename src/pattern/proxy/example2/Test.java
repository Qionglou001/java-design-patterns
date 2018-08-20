package pattern.proxy.example2;


public class Test {
	public static void main(String[] args) {
	    GamePlayerProxy proxy = new GamePlayerProxy("wagnjianlou");
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
    }
}
