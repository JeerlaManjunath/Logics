package com.nt.collection;

import java.util.ArrayList;

class NIT {

	Object[] obj = new Object[10];
	int index = 0;

	public void add(Object o) {

		if (size() == capacity()) {
			incrementCapacity();
		}
		obj[index] = o;
		index++;
	}

	public void incrementCapacity() {
		Object[] temp = new Object[capacity() * 2];
		for (int i = 0; i < obj.length; i++) {
			temp[i] = obj[i];
		}
		obj = temp;
	}

	public int size() {
		return index;
	}

	public int capacity() {
		return obj.length;
	}

	public Object get(int index) {
		return obj[index];
	}

	public void remove(int i) {
		obj[i] = obj[i + 1];
		i--;
	}

	public void insert(int i) {
		obj[i + 1] = obj[i];
	}

	public void replace(int index, Object o) {

		obj[index] = o;
	}
}

public class NITCollection {

	public static void main(String[] args) {

		ArrayList<NIT> al = new ArrayList<NIT>();
		al.add(101, null);
		al.add(102, null);
		
		for(Object obj:al) {
			System.out.println(obj);
		}

	}

}
