package pattern.mediator;


public class ConcreteMediator extends AbstractMediator{

	@Override
    public void doSomething1() {
	    super.colleagueA.doThing();
	    super.colleagueB.doThing();
    }

	@Override
    public void doSomething2() {
		super.colleagueB.doThing();
	    super.colleagueA.doThing();
    }
	
}
