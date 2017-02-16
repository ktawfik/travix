package com.travix.busyflight.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travix.busyflight.supplier.crazyair.dto.CrazyAirRequestDto;
import com.travix.busyflight.supplier.crazyair.dto.CrazyAirResponseDto;
import com.travix.busyflight.supplier.crazyair.service.CrazyAirSearchService;
import com.travix.busyflight.util.Constants;

@RestController
@RequestMapping(Constants.CRAZY_AIR_URL)
public class CrazyAirSearchAPI {

	@Autowired
	CrazyAirSearchService caSearchService;
	/**
	 * This REST api handle the searches with the passed parameters
	 * @return
	 */
	@RequestMapping(value="/search" )
	public ResponseEntity<?> searchFlights(@RequestBody CrazyAirRequestDto request
			){
		List<CrazyAirResponseDto> result = caSearchService.getSearchResults(request);
		return new ResponseEntity(result, HttpStatus.OK);
	}
}
