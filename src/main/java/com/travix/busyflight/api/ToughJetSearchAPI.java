package com.travix.busyflight.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.travix.busyflight.supplier.toughjet.dto.ToughJetRequestDto;
import com.travix.busyflight.supplier.toughjet.dto.ToughJetResponseDto;
import com.travix.busyflight.supplier.toughjet.service.ToughJetSearchService;
import com.travix.busyflight.util.Constants;

@RestController
@RequestMapping(Constants.TOUGH_JET_URL)
public class ToughJetSearchAPI {

	@Autowired
	ToughJetSearchService tjSearchService;
	/**
	 * This REST api handle the searches with the passed parameters
	 * @return
	 */
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ResponseEntity<?> searchFlights(
			@RequestBody ToughJetRequestDto req){
		List<ToughJetResponseDto> result = tjSearchService.getSearchResults(req);
		return new ResponseEntity(result, HttpStatus.OK);
	}
}
