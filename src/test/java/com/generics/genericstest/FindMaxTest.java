package com.generics.genericstest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxGenericsTest {

	@Test
	public void givenMultipleInt_shouldReturn_maxInteger() {
		Integer first = 4;
		Integer second = 50;
		Integer third = 70;
		Integer fourth = 100;
		Integer fifth = 10;
		Integer sixth = 20;
		assertEquals(fourth, new FindMax<Integer>(first, second, third, fourth, fifth, sixth).testMaximum());
	}

	@Test
	public void givenMultipleFloat_shouldReturn_MaxFloat() {
		Float first = 9.54f;
		Float second = 7.4f;
		Float third = 40.1f;
		Float fourth = 10.5f;
		Float fifth = 15.7f;
		Float sixth = 200.7f;
		assertEquals(sixth, new FindMax<Float>(first, second, third, fourth, fifth, sixth).testMaximum());
	}

	@Test
	public void givenMultipeString_shouldReturn_maxstring() {
		String first = "peach";
		String second = "banana";
		String third = "apple";
		String fourth = "coconut";
		String fifth = "mango";
		String sixth = "orange";
		assertEquals(first, new FindMax<String>(first, second, third, fourth, fifth, sixth).testMaximum());
	}
}