package com.business.tcase.service;

import java.util.stream.Collectors;

import com.business.tcase.factory.AbstractFactory;
import com.business.tcase.factory.TestFactory;
import com.business.tcase.model.Order;
import com.business.tcase.model.Test;

public class TestModuleManagerService {
		 
	    private static TestModuleManagerService instance = null; 
	  
	  
	    private AbstractFactory testFactory = new TestFactory();
	    
	    
	    public static TestModuleManagerService getInstance()   { 
	        if (instance == null) 
	            instance = new TestModuleManagerService(); 
	  
	        return instance; 
	    }

	    
	    public String processOrder(Order order) {
	    	
	    	// getTests
	    	order.setListTest(order.getOrderedTests().stream().map(this::getTest).collect(Collectors.toList()));

	    	// process tests doing the calculation
	    	order.getListTest().stream()
	    	//.peek(t -> System.out.println(t.calculate()))
	    	.forEach(this::processTest);
	    	
	    	return "ordered processed";
	    	
	    }
	    
	    public Test getTest(String testType) {
	    	
	    	return testFactory.getTest(testType);
	    	
	    }
	    
	    public String processTest(Test test) {
	    	
	    	return test.calculate();
	    	
	    }

}
