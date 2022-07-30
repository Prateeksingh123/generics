package main;

public class Counter<T> {
	
	T t;
	
	Counter(T t) {
		this.t = t;
	}
	
	public void print() {
		System.out.println(t);
	}
}
