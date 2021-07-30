package com.mailorderpharma.refill.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RefillOrder {
	
	/**
	 * Refill id
	 */
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	/**
	 * Refill date 
	 */
	LocalDate refilledDate;
	/**
	 * Pay status
	 */
	private Boolean payStatus;
	/**
	 * Subscription id
	 */
	private long subId;
	/**
	 * Quantity to refill
	 */
	int quantity;
	/**
	 * Member id
	 */
	String memberId;

}
