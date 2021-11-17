package reCapProject.business.abstracts;

import java.util.List;

import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.entities.concretes.Brand;

public interface BrandService {
	Result add(Brand brand);

	Result delete(Brand brand);

	Result update(Brand brand);

	DataResult<List<Brand>> getAll();

	DataResult<Brand> getById(int id);
}
