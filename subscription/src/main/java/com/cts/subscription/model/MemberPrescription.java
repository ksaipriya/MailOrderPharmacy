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
public class MemberPrescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String memberId;
	private String memberLocation;
	private String policyNumber;
	private String insuranceProvider;
	private LocalDate date;
	private String dosage;
	private int quantity;
	private String drugName;
	private String doctorDetails;
	private int courseDuration;
	

}
