package com.example.demo.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessImplTest {

	@Test
	public void findTheGreatestFromAllData() {
		
		DataService dataServicemock = mock(DataService.class);
		when(dataServicemock.retreiveAllData()).thenReturn(new int[] {25, 15, 6}); 
		
		
		SomeBusinessImpl businessImpl  = new SomeBusinessImpl(dataServicemock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
}


