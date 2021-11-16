package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.business.utilities.BusinessRules;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {
		return this.productRepository.getAll();
	}

	@Override
	public void add(Product product) {

		var result = BusinessRules.run(checkProductPrice(product.getUnitPrice()), checkCategoryId(product),
				checkProductCountOfCategory(product), checkProductNameExists(product.getProductName()));
		
		if(result!=false) {
			productRepository.add(product);
		}
	}

	private boolean checkProductPrice(double unitPrice) {
		if (unitPrice < 0) {
			System.out.println("Fiyat - olamaz!");
			return false;
		}
		return true;
	}

	private boolean checkCategoryId(Product product) {
		if (product.getCategoryId() == 3 && product.getUnitPrice() < 10) {
			System.out.println("3. kategorideki ürünlerin fiyatı 10 dan küçük olamaz");
			return false;
		} 
		return true;

	}

	private boolean checkProductCountOfCategory(Product product) {
		var result = productRepository.getAll();
		int count = 0;
		for (Product p : result) {
			if (p.getCategoryId() == product.getCategoryId()) {
				count++;
			}
		}
		if (count >= 5) {
			System.out.println("Aynı kategoride 5 den fazla ürün olamaz!");
			return false;
		}
		return true;

	}

	private boolean checkProductNameExists(String productName) {
		var result = productRepository.getAll();
		for (Product product : result) {
			if (product.getProductName() == productName) {
				System.out.println("Aynı isimde ürün eklenemez!");
				return false;
			}

		}
		return true;
	}

}
