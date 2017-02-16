package com.travix.busyflight.exception;

/**
 * This class represents the Logical exceptions happenned in the system
 * @author ktawfik
 *
 */
public class LogicalException extends BusyFlightBaseException {

	public LogicalException(BusyFlightError err) {
		this(err, err.getMessage());
	}
	
	public LogicalException(BusyFlightError err, String msg){
		super(err, msg);
	}
	
}
