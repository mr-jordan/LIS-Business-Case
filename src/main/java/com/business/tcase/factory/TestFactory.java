package com.business.tcase.factory;

import com.business.tcase.exception.BusinessException;
import com.business.tcase.model.BiochemistryTest;
import com.business.tcase.model.HematologyTest;
import com.business.tcase.model.ImmunologyTest;
import com.business.tcase.model.Test;

public class TestFactory extends AbstractFactory {

	@Override
	public Test getTest(String orderedTest)  {
	
		switch (orderedTest) {
			// invented case's
			case  "glucose":
				return new HematologyTest();
				
			case  "sodium":
				return new BiochemistryTest();
				
			case  "hemoglobine":
				return new ImmunologyTest();

				
		default:
			throw new BusinessException ("Unrecognized type Test");
	
		}
	
	}

}
