package pattern.proxy.example1;


public class GamePlayerProxy implements IGamePlayer{
	
	private IGamePlayer player;
	
	
    public GamePlayerProxy(IGamePlayer player) {
    	this.player = player;
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
