package com.jacstuff.microbrewery.web.model.v2;

import java.util.UUID;

import com.jacstuff.microbrewery.web.model.BeerDto;

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


		
		private UUID id;
		private String beerName;
		private BeerStyle beerStyle;
		private Long upc;
}
