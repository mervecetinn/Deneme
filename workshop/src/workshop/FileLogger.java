package workshop;

public class FileLogger implements Logger {

	@Override
	public void log(Product product) {
		System.out.println("Dosyaya loglandı: "+product.getProductName());
		
	}

}
