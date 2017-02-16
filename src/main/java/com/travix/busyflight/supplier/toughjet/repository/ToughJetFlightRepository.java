package com.travix.busyflight.supplier.toughjet.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.travix.busyflight.supplier.toughjet.dto.ToughJetResponseDto;

@Service	
public class ToughJetFlightRepository {

	private static final List<ToughJetResponseDto> TOUGH_JET; 
	static {
		TOUGH_JET = new ArrayList<ToughJetResponseDto>();
		TOUGH_JET.add(new ToughJetResponseDto("YTL", 50.00, 20.00, 0.00, "LSH", "GOT"));
		TOUGH_JET.add(new ToughJetResponseDto("ABC", 88.00, 20.00, 0.00, "RHS", "FAT"));
		TOUGH_JET.add(new ToughJetResponseDto("DEF", 104.50, 20.00, 8.00, "POC", "HAT"));
		TOUGH_JET.add(new ToughJetResponseDto("GHI", 145.00, 20.00, 8.00, "AMZ", "POT"));
	}
    
	public List<ToughJetResponseDto> findAll(){
		return TOUGH_JET;
	}
}
