package com.travix.busyflight.exception;

/**
 * @author ktawfik
 * This class represents the Server exceptions happened while running the system, e.g. cannot open file, cannot read file
 * 
 *
 */
public class SystemException extends BusyFlightBaseException {

	public SystemException(BusyFlightError err) {
		this(err, err.getMessage());
	}
	
	public SystemException(BusyFlightError err, String msg) {
		super(err, msg);
	}

}
