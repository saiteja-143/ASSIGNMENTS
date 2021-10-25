package com.Test;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import primes.Primes;
public class PrimesTest {
	Primes primeObject = new Primes();

	@Test
	public void shouldAnswerWithTrueIfPrime()
	{
		assertEquals( true , primeObject.CheckForPrime(29));
	}

	@Test
	public void shouldAnswerWithFalseIfNotPrime()
	{
		assertEquals( false , primeObject.CheckForPrime(25));
	}
	

}


