package com.cts.subscription.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugLocationDetails {

	/**
	 *Serial id for location
	 */ 
	private String serialId;
	/**
	 * Location name
	 */
	private String location;
	/**
	 * Quantity per location
	 */
	private int quantity;
	
	
	/**
	 * Object of drug class containing drug details
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "drugId")
	private DrugDetails drugDetails;
}

