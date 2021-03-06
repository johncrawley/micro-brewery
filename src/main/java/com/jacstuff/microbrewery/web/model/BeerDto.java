package com.jacstuff.microbrewery.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //create getters setters, equals(), hashCode()
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

	
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime lastUpdatedDate;

}
