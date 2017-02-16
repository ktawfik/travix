package com.travix.busyflight.supplier.crazyair.dto;

import java.util.Date;
/**
 * The DTO to be returned from the search service, that combine data from other services.
 * @author ktawfik
 *
 */
public class CrazyAirRequestDto {

	private String origin;
    private String destination;
    private Date departureDate;
    private Date returnDate;
    private int numberOfPassengers;
    
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	@Override
	public String toString() {
		return "CrazyAirDto [origin=" + origin + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", returnDate=" + returnDate + ", numberOfPassengers=" + numberOfPassengers + "]";
	}

}
