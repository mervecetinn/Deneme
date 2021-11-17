package reCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import reCapProject.dataAccess.abstracts.BrandRepository;
import reCapProject.entities.concretes.Brand;

public class BrandDao implements BrandRepository {
	
	List<Brand> brands;
	
	public BrandDao() {
		brands=new ArrayList<Brand>();
	}

	@Override
	public void add(Brand entity) {
		brands.add(entity);
		
	}

	@Override
	public void delete(Brand entity) {
		brands.remove(entity);
		
	}

	@Override
	public void update(Brand entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
