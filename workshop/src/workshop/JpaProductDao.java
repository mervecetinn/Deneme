package workshop;

public class JpaProductDao implements ProductDao {

	@Override
	public void save(Product product) {
		System.out.println("Jpa ile eklendi.");
		
	}

}
