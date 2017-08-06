package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.forjunit.MyMath;

public class MyMathTest {

	@Test
	public void sumWithThreeNumbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);		
	}
	
	@Test
	public void sumWithOneNumberr() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);		
	}
}
