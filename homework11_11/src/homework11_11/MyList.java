package homework11_11;

public class MyList {
	String[] items;

	public MyList() {
		items = new String[0];
	}

	public void add(String item) {
		String[] tempList = items;
		items = new String[items.length + 1];
		for (int i = 0; i < tempList.length; i++) {
			items[i] = tempList[i];
		}
		items[items.length - 1] = item;

	}

	public void remove(int index) {
		String[] tempList = items;
		items = new String[items.length - 1];

		for (int i = 0; i < items.length; i++) {
			if (i == index) {
				items[i] = tempList[i + 1];
			} else if (i > index) {
				items[i] = tempList[i + 1];
			} else {
				items[i] = tempList[i];
			}
		}
	}

	public boolean contains(String searchingItem) {
		for (int i = 0; i < items.length; i++) {
			if (searchingItem == items[i]) {
				return true;
			}
		}
		return false;
	}

	public void list() {
		int i = 1;
		for (String listItem : getItems()) {
			System.out.println(i + ". " + listItem);
			i++;
		}
	}

	public String[] getItems() {
		return items;
	}

	public int Length() {
		return items.length;
	}

}
