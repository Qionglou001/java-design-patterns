package pattern.mediator;


public class ConcreteColleagueB extends AbstractColleague{

	public ConcreteColleagueB(AbstractMediator mediator) {
	    super(mediator);
    }
	
	public void doThing(){
		System.out.println("B开始做事");
	}
	
	public void doMediatorThing(){
		System.out.println("开始做关联事情...");
		super.mediator.doSomething2();
		System.out.println("结束做关联事情...");
	}
}
