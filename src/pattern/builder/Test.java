package pattern.builder;

/**
 * 建造者模式
 * @author wangjianlou 2018年8月20日
 * @version V1.0
 */
public class Test {
	public static void main(String[] args) {
		Directory directory = new Directory();
		ProductA productA = new ProductA();
		productA.setId("wangjianlou");
		productA.setMsg("厉害了");
		System.out.println(directory.createProductB(productA).toString());
    }
}
