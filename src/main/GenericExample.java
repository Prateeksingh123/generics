package main;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	
	public static void main(String[] args) {
		
		/*
		 * IntegerCounter intCounter = new IntegerCounter(1); intCounter.print();
		 * 
		 * DoubleCounter dCounter = new DoubleCounter(1.0); dCounter.print();
		 *
		 * Counter<Integer> iCounter = new Counter<>(1); iCounter.print();
		 * 
		 * Counter<Double> dCounter = new Counter<>(2.0); dCounter.print();
		 * 
		 * ArrayList<Integer> intList = new ArrayList<>(); intList.add(1);
		 * 
		 * Integer i = intList.get(0);
		 *
		 * print(1,2.0); print("Prateek",'S');
		 */
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		print(intList);
		
	}
	
	/*
	 * private static <T,U>void print(T t, U u) { System.out.println(t);
	 * System.out.println(u); }
	 */
	
	private static void print(List<? extends Number> list) {
		System.out.println(list);
	}

}
