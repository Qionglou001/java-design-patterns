package pattern.builder;


public class Directory {
	private IBuilder builder = new ConcreteBuilder();
	
	public ProductB createProductB(ProductA productA){
		builder.setProductB(productA);
		return builder.getProductB();
	}
	
}
