package com.travix.busyflight.exception;

/**
 * 
 * @author ktawfik
 * This class represents the DTO the user will get when an exception happened
 */
public class ErrorDto {

	private String message;
	
	private String developerMessage;
	
	private String code;
	
	private BusyFlightError.Type type;
	
	private int httpStatus;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BusyFlightError.Type getType() {
		return type;
	}

	public void setType(BusyFlightError.Type type) {
		this.type = type;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	
	@Override
	public String toString() {
		return "[message=" + message + ", developerMessage=" + developerMessage + ", code=" + code + ", type="
				+ type + ", httpStatus=" + httpStatus + "]";
	}
}
