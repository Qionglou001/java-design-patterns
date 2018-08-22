package pattern.decorator;


public class Client {
	public static void main(String[] args) {
	    SchoolReport report = new FourthGradeSchoolReport();
	    report = new HighScoreDecorator(report);
	    report = new SortDecorator(report);
	    report.report();
	    report.sign("wangminghua");
    }
}
