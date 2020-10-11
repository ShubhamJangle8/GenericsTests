package com.generics.genericstest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FindMaxTest {
	static FindMax max;

	public FindMaxTest() {
		max = new FindMax();
	}

	/**
	 * test for 1st number
	 */
	@Test
	void test1() {
		Integer expected = 5;
		Assert.assertEquals(expected, max.find(5, 2, 3));
	}

	/**
	 * test for 2nd number
	 */
	@Test
	void test2() {
		Integer expected = 4;
		Assert.assertEquals(expected, max.find(1, 4, 3));
	}

	/**
	 * test for 3rd number
	 */
	@Test
	void test3() {
		Integer expected = 3;
		Assert.assertEquals(expected, max.find(1, 2, 3));
	}

}
