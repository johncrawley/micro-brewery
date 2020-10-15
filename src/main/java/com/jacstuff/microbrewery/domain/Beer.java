package com.jacstuff.microbrewery.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
	
	private Timestamp createdDate;
	private Timestamp lastUpdatedDate;

}