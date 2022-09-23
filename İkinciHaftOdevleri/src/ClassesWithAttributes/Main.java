package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product=new Product();
		product.name="Laptop";
		product.id=1;
		product.Price=5000.0;
		product.Description="Asus i5";
		product.stockAmount=3;
		
		System.out.println(product.name);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);

		
	}

}
