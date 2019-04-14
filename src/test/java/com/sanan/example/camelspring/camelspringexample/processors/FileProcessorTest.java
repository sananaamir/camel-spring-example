package com.sanan.example.camelspring.camelspringexample.processors;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.camel.CamelContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class FileProcessorTest {

	private static final String TEST_STRING = "2 2";

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

	private List<Integer> createNumList(String numsString) {
		List<Integer> nums = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(numsString);

		while (st.hasMoreTokens()) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		return nums;
	}

}
