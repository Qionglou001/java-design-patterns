package pattern.builder;


public class Test {
	public static void main(String[] args) {
		Directory directory = new Directory();
		ProductA productA = new ProductA();
		productA.setId("wangjianlou");
		productA.setMsg("厉害了");
		System.out.println(directory.createProductB(productA).toString());
    }
}
