package pattern.decorator;


public class FourthGradeSchoolReport implements SchoolReport{

	@Override
    public void report() {
	    System.out.println("wangjianlou的成绩：语文60 数学60 自然60");
	    
    }

	@Override
    public void sign(String name) {
	   System.out.println("家长签名为：" + name);
    }
	
}
