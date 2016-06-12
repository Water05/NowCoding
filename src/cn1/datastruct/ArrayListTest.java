package cn1.datastruct;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
	   List lista = new LinkedList<>();
		UserArray<Integer> list = new UserArray();
		list.add(123);
		list.add(333);
		list.add(123);
		list.add(333);
		// list.delect(323);
		// list.set(22, 122);
		// System.out.println(list.find("333"));
		for (Iterator<Integer> ite = list.iterator(); ite.hasNext();) {
			System.out.println(ite.next());
		}
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}

class UserArray<T> implements Iterable<T> {
	private Object[] elementData;
	private int size;

	public UserArray() {
		this(10);
	}

	public UserArray(int cap) {
		this.elementData = new Object[cap];
	}

	public void add(T a) {
		if ((size + 1) > elementData.length) {
			int newLen = elementData.length + elementData.length >> 1;
			elementData = Arrays.copyOf(elementData, newLen);
		}
		elementData[size++] = a;

	}

	public void remove(int index) {

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index,
					numMoved);
		elementData[--size] = null; // Let gc do its work
	}

	public void delect(Object value) {
		if (value == null) {
			for (int i = 0; i < size; i++) {
				if (elementData[i] == null) {
					int len = size - i - 1;
					System.arraycopy(elementData, i + 1, elementData, i, len);
					elementData[--size] = null;
				}

			}
		} else {
			for (int i = 0; i < size; i++) {
				if (value.equals(elementData[i])) {
					int len = size - i - 1;
					System.arraycopy(elementData, i + 1, elementData, i, len);
					elementData[--size] = null;
				}
			}
		}

	}

	public void set(int index, T obj) {
		if (index < 0 || index > elementData.length) {
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
		}
		elementData[index] = obj;

	}

	private String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

	public int find(Object a) {
		if (a == null) {
			for (int i = 0; i < size; i++) {
				if (elementData[i] == null)
					return i;
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (a.equals(elementData[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public Iterator<T> iterator() {
		return (Iterator<T>) new Itr();
	}

	class Itr implements Iterator<T> {

		int cursor;
		int lastRet;

		@Override
		public boolean hasNext() {
			return cursor != size;
		}

		@Override
		public T next() {
			int i = cursor;
			if (i >= size) {
				throw new ConcurrentModificationException();
			}
			cursor = i + 1;
			return (T) elementData[lastRet = i];
		}

		@Override
		public void remove() {
			UserArray.this.delect(lastRet);
			cursor = lastRet;
			lastRet = -1;
		}

	}

}
