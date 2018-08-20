package pattern.proxy.example2;


public class GamePlayerProxy implements IGamePlayer{
	
	private IGamePlayer player = null;
	
    public GamePlayerProxy(String name) {
    	try {
	        this.player = new GamePlayer(this,name);
        } catch (Exception e) {
	        e.printStackTrace();
        }
    }

	@Override
    public void login() {
		player.login();
    }

	@Override
    public void killBoss() {
	    player.killBoss();
    }

	@Override
    public void upgrade() {
		player.upgrade();
    }
	
}
