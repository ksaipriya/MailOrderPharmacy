package com.mailorderpharma.refill.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MemberSubscription {
	
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
