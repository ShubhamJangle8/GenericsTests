package com.generics.genericstest;

import java.util.Arrays;

public class FindMax<x extends Comparable<x>> {
	private x[] arguments;

	/**
	 * Constructor refactored to take multiple inputs
	 * 
	 * @param first
	 * @param second
	 * @param third
	 */
	@SafeVarargs
	public FindMax(x... arguments) {
		this.arguments = arguments;
	}

	/**
	 * UC 3 refactoring to use generic class
	 * 
	 * @return
	 */
	public x testMaximum() {
		x testMaximum = testMaximum(arguments);
		printMax(testMaximum);
		return testMaximum;
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
	@SafeVarargs
	private static <E extends Comparable<E>> E testMaximum(E... variables) {
		Arrays.sort(variables);
		return variables[variables.length - 1];
	}

	/**
	 * UC 5 printing maximum element
	 * 
	 * @param <E>
	 * @param element
	 */
	private static <E> void printMax(E element) {
		System.out.println("Maximum : " + element);
	}

}