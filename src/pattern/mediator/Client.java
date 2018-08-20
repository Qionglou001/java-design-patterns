package pattern.mediator;

/**
 * 中介者模式
 * @author wangjianlou 2018年8月20日
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
	    ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
	    colleagueA.doMediatorThing();
	    colleagueA.doThing();
	    
	    ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
	    colleagueB.doMediatorThing();
    }
}
