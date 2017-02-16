package com.travix.busyflight.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travix.busyflight.dto.BusyFlightRequestDto;
import com.travix.busyflight.dto.BusyFlightResponseDto;
import com.travix.busyflight.mapper.DtoMapper;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirRequestDto;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirResponseDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetRequestDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetResponseDto;
import com.travix.busyflight.util.Constants;

@Service
public class BusyFlightSearchService {
    
	private static final RestTemplate restTemplate = new RestTemplate();
    
	/**
	 * search both suppliers, map results to BusyFlight DTO then append results
	 * @param filters
	 * @return List BusyFlightDto
	 */
	public Set<BusyFlightResponseDto> search(BusyFlightRequestDto request){
		List<BusyFlightResponseDto> caResult = getResultFromCrazyAir(DtoMapper.mapToCrazyRequest(request));
		List<BusyFlightResponseDto> tjResult = getResultFromToughJet(DtoMapper.mapToToughJetRequest(request));
		List<BusyFlightResponseDto> all = new ArrayList<BusyFlightResponseDto>();
		all.addAll(caResult);
		all.addAll(tjResult);
		// sort then remove duplicates
		Collections.sort((List<BusyFlightResponseDto>) all, new Comparator<BusyFlightResponseDto>() {
			public int compare(BusyFlightResponseDto o1, BusyFlightResponseDto o2) {
				return o1.getFare().compareTo(o1.getFare());
			}
		});
		Set<BusyFlightResponseDto> result = new HashSet<BusyFlightResponseDto>();
		result.addAll(all);
		return result; 
	}
	/**
	 * Search CrazyAir service
	 * @param filters
	 * @return
	 */
	private List<BusyFlightResponseDto> getResultFromCrazyAir(CrazyAirRequestDto request){
		HttpEntity<CrazyAirResponseDto[]> response = restTemplate.postForEntity(
				"http://localhost:8080/"+ Constants.CRAZY_AIR_URL + "/search", 
		        request, 
		        CrazyAirResponseDto[].class);
		CrazyAirResponseDto[] res = response.getBody();
		List<BusyFlightResponseDto> result = new ArrayList<BusyFlightResponseDto>();
		for(CrazyAirResponseDto o : res){
			result.add(DtoMapper.map(o));
		}
		return result;
	}
	/**
	 * Search ToughJet Service
	 * @param filters
	 * @return
	 */
	private List<BusyFlightResponseDto> getResultFromToughJet(ToughJetRequestDto request){
		HttpEntity<ToughJetResponseDto[]> response = restTemplate.postForEntity(
				"http://localhost:8080/"+ Constants.TOUGH_JET_URL+ "/search", 
		        request, 
		        ToughJetResponseDto[].class);
		ToughJetResponseDto[] res = response.getBody();
		List<BusyFlightResponseDto> result = new ArrayList<BusyFlightResponseDto>();
		for(ToughJetResponseDto o : res){
			result.add(DtoMapper.map(o));
		}
		return result;
	}
}
