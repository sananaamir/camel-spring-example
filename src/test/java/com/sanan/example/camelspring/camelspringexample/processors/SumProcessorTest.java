package com.sanan.example.camelspring.camelspringexample.processors;

import org.apache.camel.CamelContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class SumProcessorTest {

	@Autowired
	FileProcessor processor;

	@Autowired
	CamelContext context;

	@Before
	public void setup() {
	}

	@Test
	public void testProcess() {

	}
}
