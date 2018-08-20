package pattern.builder;


public class ProductB {
	private String id;
	private String msg;
	private String type;
	
    public String getId() {
    	return id;
    }
	
    public void setId(String id) {
    	this.id = id;
    }
	
    public String getMsg() {
    	return msg;
    }
	
    public void setMsg(String msg) {
    	this.msg = msg;
    }
	
    public String getType() {
    	return type;
    }
	
    public void setType(String type) {
    	this.type = type;
    }

	@Override
    public String toString() {
	    return "ProductB [id=" + id + ", msg=" + msg + ", type=" + type + "]";
    }
	
}
