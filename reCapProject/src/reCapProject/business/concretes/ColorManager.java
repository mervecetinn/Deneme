package reCapProject.business.concretes;

import java.util.List;

import reCapProject.business.abstracts.ColorService;
import reCapProject.core.utilities.results.DataResult;
import reCapProject.core.utilities.results.Result;
import reCapProject.core.utilities.results.SuccessDataResult;
import reCapProject.core.utilities.results.SuccessResult;
import reCapProject.dataAccess.abstracts.ColorRepository;
import reCapProject.entities.concretes.Color;

public class ColorManager implements ColorService {

	private ColorRepository colorRepository;

	public ColorManager(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

	@Override
	public Result add(Color color) {
		colorRepository.add(color);
		return new SuccessResult("Color is added.");
	}

	@Override
	public Result delete(Color color) {
		colorRepository.delete(color);
		return new SuccessResult("Color is deleted.");
	}

	@Override
	public Result update(Color color) {
		colorRepository.update(color);
		return new SuccessResult("Color is updated.");
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult<List<Color>>(colorRepository.getAll());
	}

	@Override
	public DataResult<Color> getById(int id) {
		return new SuccessDataResult<Color>(colorRepository.getById(id));
	}

}
