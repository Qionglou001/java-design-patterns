package pattern.builder;


public class ConcreteBuilder implements IBuilder{
	private ProductB productB = new ProductB();

	@Override
    public void setProductB(ProductA productA) {
		this.productB.setId(productA.getId());
		this.productB.setMsg(productA.getMsg());
		this.productB.setType("type");
    }

	@Override
    public ProductB getProductB() {
	    return this.productB;
    }
	
}
