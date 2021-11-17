package reCapProject.business.concretes;

import java.util.List;

import reCapProject.business.abstracts.CarService;
import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.core.utilities.results.SuccessDataResult;
import reCapProject.core.utilities.results.SuccessResult;
import reCapProject.dataAccess.abstracts.CarRepository;
import reCapProject.entities.concretes.Car;

public class CarManager implements CarService {

	private CarRepository carRepository;

	public CarManager(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public Result add(Car car) {
		carRepository.add(car);
		return new SuccessResult("Car is added.");
	}

	@Override
	public Result delete(Car car) {
		carRepository.delete(car);
		return new SuccessResult("Car is deleted");
	}

	@Override
	public Result update(Car car) {
		carRepository.update(car);
		return new SuccessResult("Car is updated.");
	}

	@Override
	public DataResult<List<Car>> getAll() {
		;
		return new SuccessDataResult<List<Car>>(carRepository.getAll());
	}

	@Override
	public DataResult<Car> getById(int id) {

		return new SuccessDataResult<Car>(carRepository.getById(id));
	}

}
