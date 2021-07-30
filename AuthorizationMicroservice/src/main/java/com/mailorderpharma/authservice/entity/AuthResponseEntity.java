package com.mailorderpharma.authservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**Model class for the business details*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponseEntity {
	/**
	 *Id for user 
	 */
	private String uid;
	/**
	 *Name of the user
	 */
	private String name;
	/**
	 *Validity check
	 */
	private boolean isValid;
}
