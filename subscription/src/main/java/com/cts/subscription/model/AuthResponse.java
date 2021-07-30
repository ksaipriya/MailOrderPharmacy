package com.cts.subscription.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**Model class for the business details*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
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
