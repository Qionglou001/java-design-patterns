package pattern.decorator;


public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport report) {
	    super(report);
    }
	
	private void sortReport(){
		System.out.println("排名第10");
	}
	
	@Override
	public void report() {
	    this.sortReport();
	    super.report();
	}
}
