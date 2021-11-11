package homework11_11;

public class Main {

	public static void main(String[] args) {
		MyList colors=new MyList();
		
		colors.add("blue");
		colors.add("pink");
		colors.add("purple");
		colors.add("blue");
		colors.add("white");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		boolean a=colors.contains("white");
		System.out.println(a);
		
		colors.remove(4);
	
		colors.list();
		
		int colorsLength=colors.Length();
		System.out.println(colorsLength);
		
		
	}

}
