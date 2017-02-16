package com.travix.busyflight.supplier.toughjet.dto;

/**
 * The DTO to be returned from the search service, that combine data from other services.
 * @author ktawfik
 *
 */
public class ToughJetRequestDto {
	
	private String from;
	private String to;
	private int departureDay;
    private int departureMonth;
    private int departureYear;
    private int returnDay;
    private int returnMonth;
    private int returnYear;
    private int numberOfAdults;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getDepartureDay() {
		return departureDay;
	}
	public void setDepartureDay(int departureDay) {
		this.departureDay = departureDay;
	}
	public int getDepartureMonth() {
		return departureMonth;
	}
	public void setDepartureMonth(int departureMonth) {
		this.departureMonth = departureMonth;
	}
	public int getDepartureYear() {
		return departureYear;
	}
	public void setDepartureYear(int departureYear) {
		this.departureYear = departureYear;
	}
	public int getReturnDay() {
		return returnDay;
	}
	public void setReturnDay(int returnDay) {
		this.returnDay = returnDay;
	}
	public int getReturnMonth() {
		return returnMonth;
	}
	public void setReturnMonth(int returnMonth) {
		this.returnMonth = returnMonth;
	}
	public int getReturnYear() {
		return returnYear;
	}
	public void setReturnYear(int returnYear) {
		this.returnYear = returnYear;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
	@Override
	public String toString() {
		return "ToughJetRequestDto [from=" + from + ", to=" + to + ", departureDay=" + departureDay
				+ ", departureMonth=" + departureMonth + ", departureYear=" + departureYear + ", returnDay=" + returnDay
				+ ", returnMonth=" + returnMonth + ", returnYear=" + returnYear + ", numberOfAdults=" + numberOfAdults
				+ "]";
	}
	
}
