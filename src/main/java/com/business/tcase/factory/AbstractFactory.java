package com.business.tcase.factory;

import com.business.tcase.model.Test;

public abstract class AbstractFactory {
	public abstract Test getTest(String testType);
}