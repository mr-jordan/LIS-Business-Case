package com.business.tcase.model;

public class HematologyTest  extends Test  {

	private String propertyF;
	
	public HematologyTest() {
		super();
	}

	public String getPropertyF() {
		return propertyF;
	}

	public void setPropertyF(String propertyF) {
		this.propertyF = propertyF;
	}
	
	
	@Override
	public String calculate() {

		return "HematologyTest calculation";
	}


}
