package com.jacstuff.microbrewery.web.mapper;

import org.mapstruct.Mapper;

import com.jacstuff.microbrewery.domain.Customer;
import com.jacstuff.microbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

	public Customer customerDtoToCustomer(CustomerDto customerDto);
	public CustomerDto customerToCustomerDto(Customer customer);

}
