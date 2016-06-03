package com.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class TestClassTest {

	@Test
	public void testA() {
		assertThat(1, equalTo(1));
	}
}
