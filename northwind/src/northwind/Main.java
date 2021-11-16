package northwind;

import northwind.business.abstracts.ProductService;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		  ProductService productService = new ProductManager(new ProductDao());
	        productService.add(new Product(1,1,"elma",-10));
	        productService.add(new Product(2,3,"Armut",5));
	        productService.add(new Product(3,1,"Karpuz",14));
	        productService.add(new Product(4,1,"Üzüm",18));
	        productService.add(new Product(5,1,"İncir",6));
	        productService.add(new Product(6,1,"Muz",14));
	        productService.add(new Product(7,1,"Kivi",18));
	        productService.add(new Product(8,1,"Erik",6));
	        productService.add(new Product(9,1,"Vişne",18));
	        productService.add(new Product(9,2,"Karpuz",28));
	       

	        for(Product product : productService.getAll()) {
	            System.out.println(product.getProductName());

	        }

	}

}
