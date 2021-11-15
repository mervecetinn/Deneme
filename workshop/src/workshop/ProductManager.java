package workshop;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
	}
	@Override
	public void save(Product product) {
		productDao.save(product);
		Utils.runLoggers(loggers, product);
		
	}

}
