package com.test;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCoverityCode {

	private JsonNode convertedConfig;
	private String testCovConfig;

	protected TestCoverityCode (String testCovConfig) throws IOException {
		this.testCovConfig = testCovConfig;
		convertedConfig = new ObjectMapper().readTree(testCovConfig);
	}

	JsonNode convertedConfig1 = new TestCoverityCode("test").convertedConfig;

	public void test() {

		System.out.println(convertedConfig1.has("bhow"));
	}
}
