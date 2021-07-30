package com.mailorderpharma.webportal.entity;

import java.time.LocalDate;

import javax.persistence.Id;

import lombok.Data;


@Data
public class SubscriptionDetails {
	@Id
	private Long subscriptionId;
	private Long prescriptionId;
	private int refillOccurrence;
	private int quantity;
	private String memberId;
	private LocalDate date;
	private String memberLocation;
	private String status;
	private String drugName;	
}
