package com.cts.subscription.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

	/**
	 * Message that the exception throws
	 */
	private String messge;
	/**
	 * Timestamp for the exception
	 */
	private LocalDateTime timestamp;
	/**
	 * Http status
	 */
	private HttpStatus status;
}
