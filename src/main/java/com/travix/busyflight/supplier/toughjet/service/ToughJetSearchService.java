package com.travix.busyflight.supplier.toughjet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travix.busyflight.supplier.toughjet.dto.ToughJetRequestDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetResponseDto;
import com.travix.busyflight.supplier.toughjet.repository.ToughJetFlightRepository;

/**
 * @author ktawfik
 *
 */
@Service
public class ToughJetSearchService {

	@Autowired
	ToughJetFlightRepository tjRepo;
	
	public List<ToughJetResponseDto> getSearchResults(ToughJetRequestDto req){
		List<ToughJetResponseDto> all = tjRepo.findAll();
		List<ToughJetResponseDto> result = new ArrayList<ToughJetResponseDto>();
		// just added a simple search functionality
		all
			.stream()
			.forEach(x ->{
				if(req.getFrom() != null && req.getFrom().equals(x.getDepartureAirportName())){
					result.add(x);
				}
			});

		return result;
	}
}
