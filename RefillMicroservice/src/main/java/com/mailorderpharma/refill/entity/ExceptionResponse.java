package com.mailorderpharma.refill.entity;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**Model class for the business details*/
public class ExceptionResponse {

	/**
	 * Exception message
	 */
	String messge;
	/**
	 * Timestamp for the error message
	 */
	LocalDateTime timestamp;
	/**
	 * Http status 
	 */
	HttpStatus status;
}
