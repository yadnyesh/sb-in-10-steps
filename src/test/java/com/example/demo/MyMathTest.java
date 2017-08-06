package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.forjunit.MyMath;

public class MyMathTest {
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void sumWithThreeNumbers() {
		System.out.println("Test1");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);		
	}
	
	@Test
	public void sumWithOneNumberr() {
		System.out.println("Test2");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);		
	}
}
