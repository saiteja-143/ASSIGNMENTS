package com.numberlist;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class NumbersListStreamTest
{
	/**
	 * Rigorous Test :-)
	 */

	@Test
	public void afterSortingElementsShouldReturnSortedList()
	{
		List<Integer> NumberStore = Arrays.asList(40,42,42,45,82,10,20,82,64,53,64,53);
		List<Integer> SortedList = Arrays.asList(10,20,40,42,45,53,64,82);
		assertEquals(SortedList, NumbersListStream.ListSortingMethod(NumberStore));
	}
}
