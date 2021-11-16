package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	ProductRepository productRepository;
	public ProductManager(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	@Override
	public List<Product> getAll() {
		return this.productRepository.getAll();
	}

	@Override
	public void add(Product product) {
		
		if(checkProductPrice(product.getUnitPrice()) && checkCategoryId(product) &&checkProductCountOfCategory(product)&&checkProductNameExists(product)) {
			this.productRepository.add(product);
		}
			
			
		
		
		
	}
	
	private boolean checkProductPrice(double unitPrice) {
		if(unitPrice<0) {
			System.out.println("Fiyat - olamaz.");
			return false;
		}
		return true;
	}
	
	private boolean checkCategoryId(Product product) {
		if(product.getCategoryId()==3 && product.getUnitPrice()>10) {
			return true;
		}
		else if(product.getCategoryId()!=3 && product.getUnitPrice()>0) {
			return true;
		}
		System.out.println("3. kategorideki ürünlerin fiyatı 10 dan küçük olamaz");
		return false;
		
	}
	
	private boolean checkProductCountOfCategory(Product product) {
		var result=productRepository.getAll();
		int count=0;
		for(Product p:result) {
		if(p.getCategoryId()==product.getCategoryId()) {
			count++;
		}
		}
		if(count>=5) {
			System.out.println("Aynı kategoriden 5 den fazla ürün olamaz");
			return false;
		}
		return true;
		
	}
	
	private boolean checkProductNameExists(Product product) {
		var result=productRepository.getAll();
		for(Product p:result) {
			if(p.getProductName()==product.getProductName()) {
				System.out.println("Aynı isimde ürün eklenemez");
				return false;
			}
			
			}
		return true;
	}
	
	
	
	
	
	

}
