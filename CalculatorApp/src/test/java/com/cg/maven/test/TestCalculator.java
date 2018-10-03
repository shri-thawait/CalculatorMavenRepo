package com.cg.maven.test;
import org.junit.Test;

import junit.framework.Assert;

import com.cg.demo.Calculator;

public class TestCalculator {
	
	@Test
	public void testAdd(){
		Calculator c1 = new Calculator();
		int res = c1.add(3, 6);
		Assert.assertEquals(9, res);
	}
	
	@Test
	public void testSubtract(){
		Calculator c1 = new Calculator();
		int res = c1.subtract(10, 6);
		Assert.assertEquals(4, res);
	}
}
