package com.business.tcase.exception;

public class BusinessException extends RuntimeException {

	/**
	 *  BusinessException extends from RunTimeException , to avoid catching inside a lambda expression. 
	 */
	private static final long serialVersionUID = -6530359932150591608L;

	public BusinessException(String message)  {
	
		super(message);
	}

}
