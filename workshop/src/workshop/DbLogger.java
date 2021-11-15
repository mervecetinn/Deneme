package workshop;

public class DbLogger implements Logger {

	@Override
	public void log(Product product) {
		System.out.println("Veritabanına loglandı: " +product.getProductName());
		
	}

}
