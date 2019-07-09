package com.visa.prj.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTimeTimeTime() {
		Time data1 = new Time(3, 5);
		Time data2 = new Time(4, 6);
		Time result = Time.addTime(data1, data2);
		Time expected = new Time(7, 11);
		assertTrue(expected.equals(result));
		}

	@Test
	public void testAddTimeTime() {
		Time data1 = new Time(3, 5);
		Time data2 = new Time(4, 6);
		Time result = data1.addTime(data2);
		Time expected = new Time(7, 11);
		assertTrue(expected.equals(result));
	}

}
