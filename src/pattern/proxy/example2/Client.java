package pattern.proxy.example2;


public class Client {
	public static void main(String[] args) {
	    GamePlayerProxy proxy = new GamePlayerProxy("wagnjianlou");
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
    }
}
