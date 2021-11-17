package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.business.utilities.BusinessRules;
import northwind.core.utilities.results.DataResult;
import northwind.core.utilities.results.ErrorResult;
import northwind.core.utilities.results.Result;
import northwind.core.utilities.results.SuccessDataResult;
import northwind.core.utilities.results.SuccessResult;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productRepository.getAll());
	}

	@Override
	public Result add(Product product) {

		var result = BusinessRules.run(checkProductPrice(product.getUnitPrice()), checkCategoryId(product),
				checkProductCountOfCategory(product), checkProductNameExists(product.getProductName()));
		
		if(result==null) {
			productRepository.add(product);
			return new SuccessResult("Ürün eklendi.");
		}
		else {
			return new ErrorResult("Ürün eklenemedi");
		}
	}

	private Result checkProductPrice(double unitPrice) {
		if (unitPrice < 0) {
			return new ErrorResult("Fiyat - olamaz!");
		}
		return new SuccessResult();
	}

	private Result checkCategoryId(Product product) {
		if (product.getCategoryId() == 3 && product.getUnitPrice() < 10) {
			return new ErrorResult("3. kategorideki ürünlerin fiyatı 10 dan küçük olamaz");
		} 
		return new SuccessResult();

	}

	private Result checkProductCountOfCategory(Product product) {
		var result = productRepository.getAll();
		int count = 0;
		for (Product p : result) {
			if (p.getCategoryId() == product.getCategoryId()) {
				count++;
			}
		}
		if (count >= 5) {
			return new ErrorResult("Aynı kategoride 5 den fazla ürün olamaz!");
		}
		return new SuccessResult();

	}

	private Result checkProductNameExists(String productName) {
		var result = productRepository.getAll();
		for (Product product : result) {
			if (product.getProductName() == productName) {
				return new ErrorResult("Aynı isimde ürün eklenemez!");
			}

		}
		return new SuccessResult();
	}

}
