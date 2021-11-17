package reCapProject.business.abstracts;

import java.util.List;

import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.entities.concretes.Brand;
import reCapProject.entities.concretes.Color;

public interface ColorService {
	Result add(Color color);

	Result delete(Color color);

	Result update(Color color);

	DataResult<List<Color>> getAll();

	DataResult<Color> getById(int id);
}
