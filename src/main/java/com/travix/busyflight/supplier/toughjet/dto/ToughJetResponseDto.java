package com.travix.busyflight.supplier.toughjet.dto;

/**
 * The DTO to be returned from the search service, that combine data from other services.
 * @author ktawfik
 *
 */
public class ToughJetResponseDto {
	
	private static String NAME="Tough Jet";
	private String carrier;
    private Double basePrice;
    private Double discount;
    private Double tax;
	private int departureDay;
    private int departureMonth;
    private int departureYear;
    private int returnDay;
    private int returnMonth;
    private int returnYear;
    private String arrivalAirportName;
    private String departureAirportName;
    
    public ToughJetResponseDto(){
    	
    }
    public ToughJetResponseDto(String airline, Double price, Double tax, Double discount, String departCode, String destCode) {
		// TODO Auto-generated constructor stub
    		this.basePrice = price;
    		this.tax = tax;
    		this.discount = discount;
    		this.carrier = airline;
    		this.departureAirportName = departCode;
    		this.arrivalAirportName = arrivalAirportName;
	}

	public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
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

	public String getArrivalAirportName() {
		return arrivalAirportName;
	}

	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}

	public String getDepartureAirportName() {
		return departureAirportName;
	}

	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}

	public static String getName() {
		return NAME;
	}

	public static void setName(String nAME) {
		NAME = nAME;
	}
}
