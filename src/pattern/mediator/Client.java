package pattern.mediator;


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
