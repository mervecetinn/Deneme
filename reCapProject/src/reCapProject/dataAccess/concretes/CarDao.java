package reCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import reCapProject.dataAccess.abstracts.CarRepository;
import reCapProject.entities.concretes.Car;

public class CarDao implements CarRepository {
	
	List<Car> cars;
	
	public CarDao() {
		cars=new ArrayList<Car>();
	}

	@Override
	public void add(Car entity) {
		cars.add(entity);
		
	}

	@Override
	public void delete(Car entity) {
		cars.remove(entity);
		
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> getAll() {
		return cars;
	}

}
