package com.jacstuff.microbrewery.services.customer;

import java.util.UUID;

import com.jacstuff.microbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID id);
	CustomerDto create(CustomerDto customerDto);
	void delete(UUID customerId);
	void update(UUID customerId, CustomerDto customerDto);

}
