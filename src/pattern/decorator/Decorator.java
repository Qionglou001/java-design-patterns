package pattern.decorator;


public class Decorator implements SchoolReport{
	private SchoolReport report;
	
    public Decorator(SchoolReport report) {
	    this.report = report;
    }
	

	@Override
    public void report() {
		report.report();
	    
    }

	@Override
    public void sign(String name) {
	    report.sign(name);
    }
	
}
