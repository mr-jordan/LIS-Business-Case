package com.business.testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.business.tcase.factory.AbstractFactory;
import com.business.tcase.factory.TestFactory;
import com.business.tcase.model.Order;
import com.business.tcase.service.TestModuleManagerService;

/**
 * Unit test for simple of the TestModule Manager
 */
@TestInstance(Lifecycle.PER_CLASS)
public class TestModuleManager {

	private Order order;
	private AbstractFactory abstractFactory;
	private TestModuleManagerService serviceTest;

	/**
	 * Create a order with several tests ordered, instantiate the Test Factory for unitary tests.
	 */
	
	@BeforeAll
	public void setup() {

		serviceTest = TestModuleManagerService.getInstance();
		
		// for unit Test purpose
		abstractFactory = new TestFactory();

	    order = new Order();
		order.setOrderedTests(Arrays.asList("glucose", "sodium"));

	}

	@DisplayName("HematologyTest calculation")
	@Test
	public void testHematologyTest()  {

		assertEquals(abstractFactory.getTest("glucose").calculate(), "HematologyTest calculation");

	}
	
	
	@DisplayName("BiochemistryTest calculation")
	@Test
	public void testBioChemistryTest()  {

		assertEquals(abstractFactory.getTest("sodium").calculate(), "BioChemistryTest calculation");

	}

	
	@DisplayName("ImmunologyTest calculation")
	@Test
	public void testImmunologyTest() {

		assertEquals(abstractFactory.getTest("hemoglobine").calculate(), "ImmunologyTest calculation");

	}
	
	@DisplayName("Test an entire Order")
	@Test
	public void testOrder() {
		
		assertEquals(serviceTest.processOrder(order), "ordered processed");

	}
	
	
	
	@DisplayName("Unrecognized Test")
	@Test
    public void unrecognizedTest()
	{

		Assertions.assertThrows(Exception.class, () -> {
			abstractFactory.getTest("potasium");
		});

	}


}
