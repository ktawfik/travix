package com.travix.busyflight.api;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.travix.busyflight.dto.BusyFlightRequestDto;
import com.travix.busyflight.dto.BusyFlightResponseDto;
import com.travix.busyflight.exception.BusyFlightError;
import com.travix.busyflight.exception.LogicalException;
import com.travix.busyflight.service.BusyFlightSearchService;
import com.travix.busyflight.util.Constants;

@RestController
@RequestMapping(Constants.BASE_API_URL)
public class BusyFlightSearchController {

	@Autowired
	BusyFlightSearchService bfSearchService;
	/**
	 * This REST api handle the searches with the passed parameters
	 * @return
	 * @throws LogicalException 
	 */
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ResponseEntity<?> searchFlights(
			@RequestBody BusyFlightRequestDto req) throws LogicalException{
		if(req.getNumberOfPassengers() > 4){
			throw new LogicalException(BusyFlightError.BUSY_FLIGHT_001);
		}
		Set<BusyFlightResponseDto> result = bfSearchService.search(req);
		return new ResponseEntity(result, HttpStatus.OK);
	}
}
