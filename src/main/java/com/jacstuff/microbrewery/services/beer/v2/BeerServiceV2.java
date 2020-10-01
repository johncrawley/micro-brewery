package com.jacstuff.microbrewery.services.beer.v2;

import java.util.UUID;


import com.jacstuff.microbrewery.web.model.v2.BeerDtoV2;


public interface BeerServiceV2{
	public BeerDtoV2 getBeerById(UUID beerId);
	public BeerDtoV2 saveBeer(BeerDtoV2 beerDto);
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto);
	public void deleteById(UUID beerId);
}
