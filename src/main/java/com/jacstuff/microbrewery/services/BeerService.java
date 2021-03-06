package com.jacstuff.microbrewery.services;

import java.util.UUID;

import com.jacstuff.microbrewery.web.model.BeerDto;


public interface BeerService {
	public BeerDto getBeerById(UUID beerId);
	public BeerDto saveBeer(BeerDto beerDto);
	public void updateBeer(UUID beerId, BeerDto beerDto);
	public void deleteById(UUID beerId);
}
