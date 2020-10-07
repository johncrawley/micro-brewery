package com.jacstuff.microbrewery.services.beer.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jacstuff.microbrewery.services.BeerServiceImpl;
import com.jacstuff.microbrewery.web.model.v2.BeerDtoV2;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

	public BeerServiceV2Impl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BeerDtoV2 getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub

	}

}
