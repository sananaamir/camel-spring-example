package com.sanan.example.camelspring.camelspringexample.processors;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
		ArrayList<Integer> nums = createNumsList(input);
		exchange.getIn().setBody(nums);
	}

	private ArrayList<Integer> createNumsList(String numString) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(numString);

		while (st.hasMoreTokens()) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		return nums;
	}
}
