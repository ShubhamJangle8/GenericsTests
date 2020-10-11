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
		Float expected = 5.0f;
		Assert.assertEquals(expected, max.find(5.0f, 2f, 3.0f));
	}

	/**
	 * test for 2nd number
	 */
	@Test
	void test2() {
		Float expected = 4f;
		Assert.assertEquals(expected, max.find(1f, 4f, 3f));
	}

	/**
	 * test for 3rd number
	 */
	@Test
	void test3() {
		Float expected = 3f;
		Assert.assertEquals(expected, max.find(1f, 2f, 3f));
	}

}
