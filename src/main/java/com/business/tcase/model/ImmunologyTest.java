package com.business.tcase.model;

public class ImmunologyTest extends Test {

	private String propertyD;
	
	public ImmunologyTest() {
		super();
	}
	
	@Override
	public String calculate() {
		return "ImmunologyTest calculation";
	}

	public String getPropertyD() {
		return propertyD;
	}

	public void setPropertyD(String propertyD) {
		this.propertyD = propertyD;
	}

}
