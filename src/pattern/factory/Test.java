package pattern.factory;

/**
 * 工厂方法模式
 * @author wangjianlou 2018年8月20日
 * @version V1.0
 */
public class Test {
	public static void main(String[] args){
		AbstractHumanFactory factory = new HumanFactory();
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.talk();
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.talk();
	}
}
