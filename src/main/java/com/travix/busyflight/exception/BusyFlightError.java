package com.travix.busyflight.exception;

import org.springframework.http.HttpStatus;
/**
 * 
 * @author ktawfik
 *
 * This class contains all errors handled by the application, contains (message, type and httpStatus)
 */
public enum BusyFlightError {

	BUSY_FLIGHT_001("Number of passengers cannot be greater than 4"), 
	BUSY_FLIGHT_002("No content matched your query", Type.INFO, HttpStatus.NO_CONTENT);


	public enum Type {
		ERROR, WARNING, INFO;
	};

	private Type type;
	private transient HttpStatus status;
	private boolean notifyDevelopers;
	private final String message;

	
	private BusyFlightError(String message) {
		this(message, HttpStatus.BAD_REQUEST);
	}

	private BusyFlightError(String message, HttpStatus status){
		this(message, Type.ERROR, status, false);
	}
	
	private BusyFlightError(String message, Type t) {
		this(message, t, HttpStatus.BAD_REQUEST, false);
	}
	
	private BusyFlightError(String message, Type t , HttpStatus status) {
		this(message, t, status, false);
	}
	
	private BusyFlightError(String message, Type t, HttpStatus status, boolean notifyDevloper) {
		this.type = t;
		this.status = status;
		this.notifyDevelopers = notifyDevloper;
		this.message = message;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public boolean isNotifyDevelopers() {
		return notifyDevelopers;
	}

	public void setNotifyDevelopers(boolean notifyDevelopers) {
		this.notifyDevelopers = notifyDevelopers;
	}

	public String getMessage() {
		return message;
	}


}
