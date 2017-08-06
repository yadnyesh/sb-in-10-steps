package com.example.demo.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void findTheGreatestFromAllData() {		
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {25, 15, 6}); 	
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
}


