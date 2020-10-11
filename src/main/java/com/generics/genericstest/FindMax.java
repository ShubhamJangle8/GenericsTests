package com.generics.genericstest;

public class FindMax {
	
	/**
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Float find(Float first, Float second, Float third) {
		if (first.compareTo(second) == 1 && first.compareTo(third) == 1) {
			return first;
		} 
		else if (second.compareTo(third) == 1 && second.compareTo(first) == 1) {
			return second;
		} 
		else {
			return third;
		}
	}

} 	
