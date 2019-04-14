package com.sanan.example.camelspring.camelspringexample.processors;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SumProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		@SuppressWarnings("unchecked")
		ArrayList<Integer> nums = exchange.getIn().getBody(ArrayList.class);
		int sum = 0;

		for (int i = 0; i < nums.size(); ++i) {
			sum += nums.get(i);
		}
		exchange.getIn().setBody(Integer.toString(sum));
	}
}
