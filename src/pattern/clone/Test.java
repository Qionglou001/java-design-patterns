package pattern.clone;


public class Test {
	public static void main(String[] args) {
	    Student stu = new Student();
	    stu.setName("wangjianlou");
	    stu.setAge("23");
	    stu.setList("1");
	    stu.setList("2");
	    
	    Student s = stu.clone();
	    s.setList("3");
	    System.out.println(stu);
	    System.out.println(s);
    }
}
