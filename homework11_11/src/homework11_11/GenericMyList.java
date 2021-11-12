package homework11_11;

public class GenericMyList<T> {
	Object[] items;

	public GenericMyList() {
		items = new Object[0];
	}

	public void add(T item) {
		Object[] tempList = items;
		items = new Object[items.length + 1];
		for (int i = 0; i < tempList.length; i++) {
			items[i] = tempList[i];
		}
		items[items.length - 1] = item;

	}

	public void remove(int index) {
		if (index < 0 || index >= items.length) {
			System.out.println("False Index!");
		} else {
			Object[] tempList = items;
			items = new Object[items.length - 1];

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
	}

	public void removeOne(T removedItem) {
		int removedItemFirstIndex = getFirstIndex(items, removedItem);
		if (removedItemFirstIndex == -1) {
			System.out.println("There is not such item!");
		} else {
			Object[] tempList = items;
			items = new Object[items.length - 1];

			for (int i = 0; i < items.length; i++) {
				if (i == removedItemFirstIndex) {
					items[i] = tempList[i + 1];
				} else if (i > removedItemFirstIndex) {
					items[i] = tempList[i + 1];
				} else {
					items[i] = tempList[i];
				}
			}
		}
	}

	public void removeAll(T removedItem) {

		int removedItemCount = getCount(items, removedItem);
		if (removedItemCount == 0) {
			System.out.println("There is not such item!");
		} else {
			Object[] tempList = items;
			items = new Object[items.length - removedItemCount];
			int count = 0;

			for (int i = 0; i < tempList.length; i++) {
				if (tempList[i] != removedItem) {
					items[count] = tempList[i];
					count = count + 1;
				} else {
					continue;
				}
			}
		}
	}

	public boolean contains(T searchingItem) {
		for (int i = 0; i < items.length; i++) {
			if (searchingItem == items[i]) {
				return true;
			}
		}
		return false;
	}

	public void list() {
		int i = 1;
		for (Object listItem : getItems()) {
			System.out.println(i + ". " + listItem);
			i++;
		}
	}

	public Object[] getItems() {
		return items;
	}

	private int getCount(Object items[], T searchingItem) {
		int count = 0;
		for (Object item : items) {
			if (item == searchingItem) {
				count++;
			}
		}
		return count;
	}

	private int getFirstIndex(Object items[], T searchingItem) {
		int index = -1;
		for (int i = 0; i < items.length; i++) {
			if (searchingItem == items[i]) {
				index = i;
				break;

			}
		}
		return index;
	}

	public int length() {
		return items.length;
	}

}
