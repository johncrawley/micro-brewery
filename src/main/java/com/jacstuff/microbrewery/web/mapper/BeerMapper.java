package com.jacstuff.microbrewery.web.mapper;

import org.mapstruct.Mapper;

import com.jacstuff.microbrewery.domain.Beer;
import com.jacstuff.microbrewery.web.model.BeerDto;

@Mapper(uses= {DateMapper.class})
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
}
