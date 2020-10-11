package com.generics.genericstest;

public class FindMax<x extends Comparable<x>> {
	x first, second, third;

	/**
	 * Constructor
	 * 
	 * @param first
	 * @param second
	 * @param third
	 */
	public FindMax(x first, x second, x third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	/**
	 * UC 3 refactoring to use generic class
	 * 
	 * @return
	 */
	public x testMaximum() {
		return testMaximum(first, second, third);
	}

	/**
	 * UC 3 refactoring to use generic method
	 * 
	 * @param <E>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	private static <E extends Comparable<E>> E testMaximum(E firstVar, E secondVar, E thirdVar) {
		if (firstVar.compareTo(secondVar) > 0 && firstVar.compareTo(thirdVar) > 0)
			return firstVar;
		else if (secondVar.compareTo(firstVar) > 0 && secondVar.compareTo(thirdVar) > 0)
			return secondVar;
		else
			return thirdVar;
	}
}