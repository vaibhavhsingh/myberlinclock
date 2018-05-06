package com.ubs.opsit.interviews.exceptions;

public class DateParseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2598980545151168604L;
	
	public DateParseException(String s) {
        super(s);
    }
	
	public DateParseException(Throwable t) {
        super(t);
    }
	
	public DateParseException(String s, Throwable t) {
        super(s, t);
    }
}
