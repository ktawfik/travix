package com.travix.busyflight.mapper;

import java.util.Calendar;

import com.travix.busyflight.dto.BusyFlightRequestDto;
import com.travix.busyflight.dto.BusyFlightResponseDto;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirRequestDto;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirResponseDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetRequestDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetResponseDto;

public class DtoMapper { 
	
	public static CrazyAirRequestDto mapToCrazyRequest(BusyFlightRequestDto req){
		CrazyAirRequestDto car = new CrazyAirRequestDto();
		car.setDepartureDate(req.getDepartureDate());
		car.setDestination(req.getDestination());
		car.setOrigin(req.getOrigin());
		car.setNumberOfPassengers(0);
		return car;
	}
	
	public static ToughJetRequestDto mapToToughJetRequest(BusyFlightRequestDto req){
		ToughJetRequestDto car = new ToughJetRequestDto();
		Calendar cal = Calendar.getInstance();
	    cal.setTime(req.getDepartureDate());
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
		car.setDepartureDay(cal.get(Calendar.DAY_OF_MONTH));
		car.setDepartureMonth(cal.get(Calendar.MONTH));
		car.setDepartureYear(cal.get(Calendar.YEAR));
		
		cal.setTime(req.getReturnDate());
	    year = cal.get(Calendar.YEAR);
	    month = cal.get(Calendar.MONTH);
	    day = cal.get(Calendar.DAY_OF_MONTH);
		car.setDepartureDay(cal.get(Calendar.DAY_OF_MONTH));
		car.setDepartureMonth(cal.get(Calendar.MONTH));
		car.setDepartureYear(cal.get(Calendar.YEAR));
		
		car.setTo(req.getDestination());
		car.setFrom(req.getOrigin());
		car.setNumberOfAdults(req.getNumberOfPassengers());
		return car;
	}
	
	
    public static BusyFlightResponseDto map(CrazyAirResponseDto cr) {
    		BusyFlightResponseDto bf = new BusyFlightResponseDto();
        bf.setAirline(cr.getAirline());
        bf.setSupplier(cr.getName());
        bf.setFare(new Double(cr.getPrice()));
        bf.setDepartureAirportCode(cr.getDepartureAirportCode());
        bf.setDestinationAirportCode(cr.getDestinationAirportCode());
        bf.setDepartureDate(cr.getDepartureDate());
        bf.setArrivalDate(cr.getArrivalDate());
        return bf;
    }

    public static BusyFlightResponseDto map(ToughJetResponseDto tr) {
    		BusyFlightResponseDto r = new BusyFlightResponseDto();
        r.setAirline(tr.getCarrier());
        r.setSupplier(tr.getName());
        r.setFare(new Double(tr.getBasePrice() + tr.getTax() - tr.getDiscount()));
        r.setDepartureAirportCode(tr.getDepartureAirportName());
        r.setDestinationAirportCode(tr.getArrivalAirportName());
        int day = tr.getDepartureDay();  
        int month = tr.getDepartureMonth();
        int year = tr.getDepartureYear(); 
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day, 0, 0);  
        r.setDepartureDate(c.getTime());
        day = tr.getReturnDay();  
        month = tr.getReturnMonth();
        year = tr.getReturnYear(); 
        c.set(year, month-1, day, 0, 0);  
        r.setArrivalDate(c.getTime());
        return r;
    }
}
