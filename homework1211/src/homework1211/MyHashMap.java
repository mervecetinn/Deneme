package homework1211;

public class MyHashMap<T1, T2> {
	Object[] keys;
	Object[] values;

	public MyHashMap() {
		keys = new Object[0];
		values = new Object[0];
	}

	public void put(T1 key, T2 value) {
		Object[] tempForKeys = keys;
		Object[] tempForValues = values;
		keys = new Object[keys.length + 1];
		values = new Object[values.length + 1];

		for (int i = 0; i < tempForKeys.length; i++) {
			keys[i] = tempForKeys[i];
			values[i] = tempForValues[i];
		}
		keys[keys.length - 1] = key;
		values[values.length - 1] = value;

	}

	public void remove(T1 key) {
		int index = getIndex(keys, key);
		if (index == -1) {
			System.out.println("Incorrect key!");
		} else {
			Object[] tempForKeys = keys;
			Object[] tempForValues = values;
			keys = new Object[keys.length - 1];
			values = new Object[values.length - 1];

			for (int i = 0; i < keys.length; i++) {
				if (i < index) {
					keys[i] = tempForKeys[i];
					values[i] = tempForValues[i];
				} else if (i == index) {
					keys[i] = tempForKeys[i + 1];
					values[i] = tempForValues[i + 1];
				} else {
					keys[i] = tempForKeys[i + 1];
					values[i] = tempForValues[i + 1];
				}
			}
		}
	}

	public Object get(T1 key) {
		int index = getIndex(keys, key);
		if (index == -1) {
			System.out.println("Incorrect key!");
			return null;
		} else {
			return values[index];
		}
	}

	public void list() {
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i] + "=" + values[i] + " ");
		}

	}

	public int size() {
		return keys.length;
	}

	public void clear() {
		keys = new Object[0];
		values = new Object[0];
	}

	public String[] keySet() {
		String[] keyList = new String[keys.length];
		for (int i = 0; i < keys.length; i++) {
			keyList[i] = keys[i].toString();
		}
		return keyList;
	}

	public String[] values() {
		String[] valueList = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			valueList[i] = values[i].toString();
		}
		return valueList;
	}

	private int getIndex(Object items[], T1 searchingItem) {
		int index = -1;
		for (int i = 0; i < items.length; i++) {
			if (searchingItem == items[i]) {
				index = i;
				break;

			}
		}
		return index;
	}

}
