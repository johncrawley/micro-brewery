package com.jacstuff.microbrewery.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jacstuff.microbrewery.services.customer.CustomerService;
import com.jacstuff.microbrewery.web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customer")
@Validated
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){	
		return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
	}	
	
	
	@PostMapping("/")
	public ResponseEntity<CustomerDto> createCustomer(@Valid @RequestBody @NotNull CustomerDto customerDto){
		return new ResponseEntity<>(customerService.create(customerDto), HttpStatus.CREATED);
	}	
	
	
	@PutMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateCustomer(@PathVariable("customerId") UUID customerId, @Valid @NotNull @RequestBody CustomerDto customerDto){
		customerService.update(customerId, customerDto);
	}	
	
	
	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") UUID customerId){
		customerService.delete(customerId);
	}
	
}
