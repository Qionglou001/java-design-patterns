package pattern.clone;

import java.util.ArrayList;
import java.util.List;


public class Student implements Cloneable{
	private String name;
	private String age;
	private ArrayList<String> list = new ArrayList<String>();
	
    public String getName() {
    	return name;
    }
	
    public void setName(String name) {
    	this.name = name;
    }
	
    public String getAge() {
    	return age;
    }
	
    public void setAge(String age) {
    	this.age = age;
    }
	
    public List<String> getList() {
    	return list;
    }
	
    public void setList(String s) {
    	this.list.add(s);
    }
    
    
	
	@Override
    public String toString() {
	    return "Student [name=" + name + ", age=" + age + ", list=" + list + "]";
    }

	@SuppressWarnings("unchecked")
    @Override
	public Student clone(){
		Student stu = null;
        try {
	        stu = (Student)super.clone();
	        stu.list = (ArrayList<String>)this.list.clone();
        } catch (CloneNotSupportedException e) {
	        e.printStackTrace();
        }
	    return stu;
	}
}
