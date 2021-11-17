package reCapProject;

import reCapProject.business.abstracts.BrandService;
import reCapProject.business.abstracts.CarService;
import reCapProject.business.abstracts.ColorService;
import reCapProject.business.concretes.CarManager;
import reCapProject.business.concretes.ColorManager;
import reCapProject.business.concretes.BrandManager;
import reCapProject.dataAccess.concretes.BrandDao;
import reCapProject.dataAccess.concretes.CarDao;
import reCapProject.dataAccess.concretes.ColorDao;
import reCapProject.entities.concretes.Brand;
import reCapProject.entities.concretes.Car;
import reCapProject.entities.concretes.Color;

public class Main {

	public static void main(String[] args) {
		BrandService brandService=new BrandManager(new BrandDao());
		brandService.add(new Brand(1,"Dacia"));
		brandService.add(new Brand(2,"Opel"));
		brandService.add(new Brand(3,"Renault"));
		brandService.add(new Brand(4,"Toyota"));
		
		ColorService colorService=new ColorManager(new ColorDao());
		colorService.add(new Color(1,"black"));
		colorService.add(new Color(2,"white"));
		
		CarService carService=new CarManager(new CarDao());
		
		Car car1 =new Car(1,1,1,2010,200000,"Dacia Duster");
		carService.add(new Car(2,2,1,2010,200000,"Opel Astra"));
		carService.add(new Car(3,3,1,2010,200000,"Renault Clio"));
		carService.add(new Car(4,4,1,2010,200000,"Toyota Corolla"));
		carService.add(car1);
		carService.delete(car1);
		
		for(Brand brand:brandService.getAll().getData()) {
			System.out.println(brand.getName());
		}
		System.out.println("*********************");
		for(Color color:colorService.getAll().getData()) {
			System.out.println(color.getName());
		}
		System.out.println("*********************");
		for(Car car:carService.getAll().getData()) {
			System.out.println(car.getDescription());
		}
		
		
		
		

	}

}
