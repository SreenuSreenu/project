package com.springBoot.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<DataNotFoundException> handleDataNotFoundException(DataNotFoundException dataNotFound) {
		DataNotFoundDetails dataNotFoundDetails = new DataNotFoundDetails(new Date(),
				dataNotFound.getMessage());

		return new ResponseEntity(dataNotFoundDetails, HttpStatus.CONFLICT);

	}

}
