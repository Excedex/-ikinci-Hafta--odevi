package JavaDersi33;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product=new Product();
		product.set_name("Laptop");
		product.setId(1);
		product.set_Price(5000.0);
		product.set_Description("Asus");
		product.set_stockAmount(3);
		product.set_Renk("Mavi");
		
		System.out.println(product.get_name());
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		product.getId();
		
		
		System.out.println(product.get_kod());
		
	}

}
