package pattern.proxy.example1;


public class Client {
	public static void main(String[] args) {
		GamePlayer player = new GamePlayer("wangjianlou");
	    GamePlayerProxy proxy = new GamePlayerProxy(player);
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
    }
}
