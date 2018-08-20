package pattern.proxy.example1;


public class Test {
	public static void main(String[] args) {
		GamePlayer player = new GamePlayer("王建楼");
	    GamePlayerProxy proxy = new GamePlayerProxy(player);
	    proxy.login();
	    proxy.killBoss();
	    proxy.upgrade();
    }
}
