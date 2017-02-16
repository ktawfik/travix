package com.travix.busyflight.exception.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.travix.busyflight.exception.ErrorDto;
import com.travix.busyflight.exception.LogicalException;
/**
 * 
 * @author ktawfik
 * This is the Exception interceptor that handle only LogicalExceptions thrown
 * and return a meaningful message to the rest client.
 * 
 */
@ControllerAdvice(annotations = RestController.class)
public class BusyFlightExceptionInterceptor {
	
	private Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(LogicalException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<ErrorDto> processLogicalException(LogicalException ex) {
        return new ResponseEntity<ErrorDto>(ex.toErrorDto() , HttpStatus.BAD_REQUEST);
    }
}
