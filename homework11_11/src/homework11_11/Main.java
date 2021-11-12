package homework11_11;

public class Main {

	public static void main(String[] args) {

		MyList colors = new MyList();

		colors.add("blue");
		colors.add("pink");
		colors.add("purple");
		colors.add("blue");
		colors.add("white");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");

		boolean a = colors.contains("white");
		System.out.println(a);

		colors.remove(4);
		colors.remove(7);
		colors.remove("blue");
		// colors.removeAll("blue");
		colors.list();

		int colorsLength = colors.length();
		System.out.println(colorsLength);

		GenericMyList<Integer> numbers = new GenericMyList<Integer>();

		numbers.add(23);
		numbers.add(38);
		numbers.add(12);
		numbers.add(5);
		numbers.add(4);
		numbers.add(23);
		numbers.add(64);
		numbers.remove(2);
		numbers.removeOne(23);
		System.out.println(numbers.contains(38));
		System.out.println(numbers.length());
		numbers.list();

	}
}