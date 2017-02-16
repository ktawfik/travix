package com.travix.busyflight.supplier.crazyair.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travix.busyflight.supplier.crazyair.dto.CrazyAirRequestDto;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirResponseDto;
import com.travix.busyflight.supplier.crazyair.repository.CrazyAirFlightRepository;

/**
 * @author ktawfik
 *
 */
@Service
public class CrazyAirSearchService {

	@Autowired
	CrazyAirFlightRepository caRepo;
	
	public List<CrazyAirResponseDto> getSearchResults(CrazyAirRequestDto req){
		List<CrazyAirResponseDto> all = caRepo.findAll();
		List<CrazyAirResponseDto> result = new ArrayList<CrazyAirResponseDto>();
		// just added a simple search functionality
		all
			.stream()
			.forEach(x ->{
				if(req.getOrigin() != null && req.getOrigin().equals(x.getDestinationAirportCode())){
					result.add(x);
				}
			});

		return result;
	}
}
