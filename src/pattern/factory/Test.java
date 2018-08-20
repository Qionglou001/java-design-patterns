package pattern.factory;


public class Test {
	public static void main(String[] args){
		AbstractHumanFactory factory = new HumanFactory();
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.talk();
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.talk();
	}
}
