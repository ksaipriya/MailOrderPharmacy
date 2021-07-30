package com.mailorderpharma.drugservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugDetails {

	@Id
	private String drugId;
	private String drugName;
	private String manufacturer;
	private Date manufactureDate;
	private Date expiryDate;
	@OneToMany(mappedBy="drugDetails")
	private List<DrugLocationDetails> druglocationQuantities = new ArrayList<>();
}

