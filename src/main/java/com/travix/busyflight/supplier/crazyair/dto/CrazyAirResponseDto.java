package com.travix.busyflight.supplier.crazyair.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * The DTO to be returned from the search service, that combine data from other services.
 * @author ktawfik
 *
 */
public class CrazyAirResponseDto {
	
	private DateFormat df = new SimpleDateFormat("mm-DD-yyyy HH:MM:ss");

	private static String name="CrazyAir";
	private String airline;
	private Double price;
	private String cabinclass;
	private String departureAirportCode;
	private String destinationAirportCode;
	private Date departureDate;
	private Date arrivalDate;
	
	public CrazyAirResponseDto(){
		
	}
    public CrazyAirResponseDto(String airline, Double price, String cabinclass, String departCode, String destCode, Date departDate, Date arrivalDate) {
        this.setAirline(airline);
        this.setPrice(price);
        this.setCabinclass(cabinclass);
        this.setDepartureAirportCode(departCode);
        this.setDestinationAirportCode(destCode);
        this.setDepartureDate(departDate);
        this.setArrivalDate(arrivalDate);
    }
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCabinclass() {
		return cabinclass;
	}
	public void setCabinclass(String cabinclass) {
		this.cabinclass = cabinclass;
	}
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		CrazyAirResponseDto.name = name;
	}
}
