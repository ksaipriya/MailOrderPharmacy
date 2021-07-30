package com.mailorderpharma.authservice.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
	/**
	 *Response message
	 */
	String message;
	/**
	 *Response date 
	 */
	LocalDateTime date;

}
