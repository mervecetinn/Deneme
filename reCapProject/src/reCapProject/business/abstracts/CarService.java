package reCapProject.business.abstracts;

import java.util.List;

import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.entities.concretes.Car;

public interface CarService {
	Result add(Car car);

	Result delete(Car car);

	Result update(Car car);

	DataResult<List<Car>> getAll();

	DataResult<Car> getById(int id);
}
