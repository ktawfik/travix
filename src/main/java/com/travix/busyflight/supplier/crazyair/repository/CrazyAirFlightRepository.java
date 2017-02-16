package com.travix.busyflight.supplier.crazyair.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.travix.busyflight.supplier.crazyair.dto.CrazyAirResponseDto;

@Service
public class CrazyAirFlightRepository {
	private static final List<CrazyAirResponseDto> CRAZY_FLIGH_LIST;
	static {
		CRAZY_FLIGH_LIST = new ArrayList<CrazyAirResponseDto>();
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("ABC", 150.80, "E", "OPS", "WET", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("KLM", 90.00,  "E", "CAR", "BNM", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("MNP", 260.00, "E", "MAT", "ERT", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("AMZ", 234.00, "E", "BAT", "JKL", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("OOL", 234.00, "E", "BAT", "JKL", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("RDL", 134.00, "E", "BAT", "JKL", new Date(), new Date()));
		CRAZY_FLIGH_LIST.add(new CrazyAirResponseDto("GOR", 321.00, "E", "BAT", "JKL", new Date(), new Date()));
	}
	
	public List<CrazyAirResponseDto> findAll(){
		return CRAZY_FLIGH_LIST;
	}
}
