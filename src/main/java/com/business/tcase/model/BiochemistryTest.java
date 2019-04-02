package com.business.tcase.model;

public class BiochemistryTest extends Test {

	private String propertyC;
	
	public BiochemistryTest() {
		super();
	}

	@Override
	public String calculate() {

		return "BioChemistryTest calculation";
	}

	public String getPropertyC() {
		return propertyC;
	}

	public void setPropertyC(String propertyC) {
		this.propertyC = propertyC;
	}

}
