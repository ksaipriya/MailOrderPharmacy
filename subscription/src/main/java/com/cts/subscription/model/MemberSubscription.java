package com.cts.subscription.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class MemberSubscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subscriptionId;
	private long prescriptionId;
	private String memberId;
	private LocalDate date;
	private int quantity;
	private String drugName;
	private int refillOccurrence; //it is used to tell occurrence i.e, the cycle of refill
	private String memberLocation;
	private String status;

}
