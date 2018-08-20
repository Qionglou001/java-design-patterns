package pattern.mediator;


public class ConcreteColleagueA extends AbstractColleague{

	public ConcreteColleagueA(AbstractMediator mediator) {
	    super(mediator);
    }
	
	public void doThing(){
		System.out.println("A正在做事");
	}
	
	public void doMediatorThing(){
		System.out.println("开始做关联事情...");
		super.mediator.doSomething1();
		System.out.println("结束做关联事情...");
	}
}
