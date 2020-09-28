package com.jacstuff.microbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jacstuff.microbrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	public BeerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(beerId)
				.beerName("rough beer")
				.beerStyle("Ale")
				.build();
	}

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("rockin' beer")
				.beerStyle("Ale")
				.build();
	}


	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		//todo: impl
		
	}

	@Override
	public void deleteById(UUID beerId) {
		//todo: impl
		log.debug("deleting beer with id " + beerId.toString());
		
	}

}
