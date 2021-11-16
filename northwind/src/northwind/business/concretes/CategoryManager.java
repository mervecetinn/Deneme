package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.CategoryService;
import northwind.dataAccess.abstracts.CategoryRepository;
import northwind.entities.concretes.Category;

public class CategoryManager implements CategoryService {
	
	CategoryRepository categoryRepository;
	
	public CategoryManager(CategoryRepository categoryRepository) {
		this.categoryRepository=categoryRepository;
	}

	@Override
	public List<Category> getAll() {
		return categoryRepository.getAll();
	}

	@Override
	public void add(Category category) {
		categoryRepository.add(category);
		
	}

}
