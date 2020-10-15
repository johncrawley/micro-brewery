package com.jacstuff.microbrewery.web.model.v2;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 *  
 *  V2 changes: replaced beer style string with enum
 */

@Data //create getters setters, equals(), hashCode()
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
		
	@Null
	private UUID id;
	@NotBlank
	private String beerName;
	

	private BeerStyle beerStyle;
	
	@Positive
	private Long upc;
	private Integer version;
	private OffsetDateTime createdDate;
	private OffsetDateTime	modifiedDate;

	private BigDecimal price;
	private Integer quantityOnHand;
}
