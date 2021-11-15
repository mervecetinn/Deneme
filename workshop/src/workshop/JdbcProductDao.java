package workshop;

public class JdbcProductDao implements ProductDao {

	@Override
	public void save(Product product) {
		System.out.println("Jdbc ile eklendi.");
		
	}

}
