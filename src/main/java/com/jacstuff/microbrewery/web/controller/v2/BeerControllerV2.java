package com.jacstuff.microbrewery.web.controller.v2;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jacstuff.microbrewery.services.beer.v2.BeerServiceV2;
import com.jacstuff.microbrewery.web.model.v2.BeerDtoV2;


@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

	public BeerControllerV2(BeerServiceV2 beerService) {
		this.beerService = beerService;
	}
	
	
	private final BeerServiceV2 beerService;
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
		
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);	
	}
	
	@PostMapping("/save")
	public ResponseEntity<BeerDtoV2> handlePost(@RequestBody BeerDtoV2 beerDto){
		BeerDtoV2 savedDto = beerService.saveBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/api/v1/beer" + savedDto.getId().toString());
		
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}
	
	// get an existing entity and update it
	@PutMapping("/{beerId}")
	public ResponseEntity<Void> handleUpdate(@PathVariable("beerId") UUID beerId, BeerDtoV2 beerDto) {
		// need safeguards to protect the ID, so client can't amend it
		beerService.updateBeer(beerId, beerDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerId") UUID beerId){
		beerService.deleteById(beerId);
	}
	
	
	

}
