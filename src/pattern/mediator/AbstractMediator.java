package pattern.mediator;


public abstract class AbstractMediator {
	protected ConcreteColleagueA colleagueA;
	protected ConcreteColleagueB colleagueB;
	
	public AbstractMediator(){
		colleagueA = new ConcreteColleagueA(this);
		colleagueB = new ConcreteColleagueB(this);
	}

	public abstract void doSomething1();
	
	public abstract void doSomething2();
}
