package pattern.decorator;


public class HighScoreDecorator extends Decorator{

	public HighScoreDecorator(SchoolReport report) {
	    super(report);
    }
	
	private void reportHighScore(){
		System.out.println("最高成绩为：语文70 数学70 自然65");
	}
	
	@Override
	public void report() {
	    this.reportHighScore();
	    super.report();
	}
}
