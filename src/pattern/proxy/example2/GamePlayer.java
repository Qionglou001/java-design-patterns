package pattern.proxy.example2;


public class GamePlayer implements IGamePlayer{
	private String name;
    public GamePlayer(IGamePlayer player, String name) throws Exception {
    	if(player == null){
    		throw new Exception("游戏角色为空");
    	}else{
    		this.name = name;
    	}
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
