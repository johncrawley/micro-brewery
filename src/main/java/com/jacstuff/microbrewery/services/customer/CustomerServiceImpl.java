package com.jacstuff.microbrewery.services.customer;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jacstuff.microbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public CustomerDto getCustomerById(UUID id) {
		// TODO Auto-generated method stub
		return new CustomerDto(id, "JimBob");
	}

	@Override
	public CustomerDto create(CustomerDto customerDto) {
		CustomerDto customer = new CustomerDto();
		customer.setId(UUID.randomUUID());
		customer.setName(customerDto.getName());
				
		return customer;
	}

	@Override
	public void delete(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

}
