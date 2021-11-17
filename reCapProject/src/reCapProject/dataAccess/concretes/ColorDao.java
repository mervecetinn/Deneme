package reCapProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import reCapProject.dataAccess.abstracts.ColorRepository;
import reCapProject.entities.concretes.Color;

public class ColorDao implements ColorRepository {
	
	List<Color> colors;
	
	public ColorDao() {
		colors=new ArrayList<Color>();
	}

	@Override
	public void add(Color entity) {
		colors.add(entity);
		
	}

	@Override
	public void delete(Color entity) {
		colors.remove(entity);
		
	}

	@Override
	public void update(Color entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> getAll() {
		return colors;
	}

}
