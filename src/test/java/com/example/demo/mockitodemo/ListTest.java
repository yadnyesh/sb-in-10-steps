package com.example.demo.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.Test;

public class ListTest {

	@Test
	public void testSize() {
		List listmock = mock(List.class);
		when(listmock.size()).thenReturn(10);
		assertEquals(10, listmock.size());
	}
	
	@Test
	public void testSize_multipleReturns() {
		List listmock = mock(List.class);
		when(listmock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listmock.size());
		assertEquals(20, listmock.size());
	}

}
