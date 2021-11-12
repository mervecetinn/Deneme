package homework1211;

public class Main {

	public static void main(String[] args) {
		MyHashMap<String, String> dictionary = new MyHashMap<String, String>();

		dictionary.put("computer", "bilgisayar");
		dictionary.put("software", "yazılım");
		dictionary.put("phone", "telefon");
		dictionary.put("television", "televizyon");

		dictionary.remove("software");
		dictionary.list();
		System.out.println(dictionary.get("phone"));
		int size = dictionary.size();
		System.out.println(size);
		
		

		for (String key : dictionary.keySet()) {
			System.out.println(key);
		}
		for (String value : dictionary.values()) {
			System.out.println(value);
		}

		dictionary.clear();
		System.out.println(dictionary.size());
	}

}
