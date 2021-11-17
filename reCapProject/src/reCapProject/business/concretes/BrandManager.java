package reCapProject.business.concretes;

import java.util.List;

import reCapProject.business.abstracts.BrandService;
import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.core.utilities.results.SuccessDataResult;
import reCapProject.core.utilities.results.SuccessResult;
import reCapProject.dataAccess.abstracts.BrandRepository;
import reCapProject.entities.concretes.Brand;

public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public Result add(Brand brand) {
		brandRepository.add(brand);
		return new SuccessResult("Brand is added.");
	}

	@Override
	public Result delete(Brand brand) {
		brandRepository.delete(brand);
		return new SuccessResult("Brand is deleted.");
	}

	@Override
	public Result update(Brand brand) {
		brandRepository.update(brand);
		return new SuccessResult("Brand is updated.");
	}

	@Override
	public DataResult<List<Brand>> getAll() {
		return new SuccessDataResult<List<Brand>>(brandRepository.getAll());
	}

	@Override
	public DataResult<Brand> getById(int id) {
		return new SuccessDataResult<Brand>(brandRepository.getById(id));
	}

}
