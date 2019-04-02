package com.business.tcase.model;

import java.util.List;

public class Order {

	private List<Test> listTest = null;
	private List<String> orderedTests = null;
	
	public Order() {
		super();
	}

	public List<Test> getListTest() {
		return listTest;
	}

	public void setListTest(List<Test> listTest) {
		this.listTest = listTest;
	}

	public List<String> getOrderedTests() {
		return orderedTests;
	}

	public void setOrderedTests(List<String> orderedTests) {
		this.orderedTests = orderedTests;
	}

	
}
