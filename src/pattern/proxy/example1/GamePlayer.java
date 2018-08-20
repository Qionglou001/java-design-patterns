package pattern.proxy.example1;


public class GamePlayer implements IGamePlayer{
	private String name;
    public GamePlayer(String name) {
	    this.name = name;
    }
	
	@Override
    public void login() {
		System.out.println(name + "登录LOL成功");
    }

	@Override
    public void killBoss() {
	    System.out.println(name + "成功carry队伍");
	    
    }

	@Override
    public void upgrade() {
		System.out.println(name + "晋级为钻石大神");
    }
	
}
