package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(Integer integer) {
		list.add((T) integer);
	}
	
	public void removeElement(T element ) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

}
