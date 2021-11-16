package northwind.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccess.abstracts.CategoryRepository;
import northwind.entities.concretes.Category;

public class CategoryDao implements CategoryRepository {
	
	List<Category> categories;
	
	public CategoryDao() {
		this.categories=new ArrayList<Category>();
	}

	@Override
	public void add(Category entity) {
		categories.add(entity);
		
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		
		return categories;
	}

}
