package com.business.tcase.model;

import com.business.tcase.interfaces.Calculable;

/**
 * @author jjnavarro
 *
 */
public abstract class Test implements Calculable {

	private String commonPropertyA;
	private String commonPropertyB;

	public Test() {
		super();
		
	}

	/**
	 * @param commonPropertyA
	 * @param commonPropertyB
	 */
	public Test(String commonPropertyA, String commonPropertyB) {
		super();
		this.commonPropertyA = commonPropertyA;
		this.commonPropertyB = commonPropertyB;
	}

	public String getCommonPropertyA() {
		return commonPropertyA;
	}

	public void setCommonPropertyA(String commonPropertyA) {
		this.commonPropertyA = commonPropertyA;
	}

	public String getCommonPropertyB() {
		return commonPropertyB;
	}

	public void setCommonPropertyB(String commonPropertyB) {
		this.commonPropertyB = commonPropertyB;
	}
	

	public String calculate() {
		return "Generic Test calculation";
	}
}
