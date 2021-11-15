package workshop;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,2,"bilgisayar",10000,5);
		Logger[] loggers= {new DbLogger(),new FileLogger()};
		ProductManager productManager=new ProductManager(new JpaProductDao(),loggers);
		productManager.save(product);

	}

}
