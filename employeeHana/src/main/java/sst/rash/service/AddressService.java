package sst.rash.service;

import java.util.List;

import org.springframework.stereotype.Component;

import sst.rash.entities.Address;

@Component
public interface AddressService {

	List<Address> getAllAddress();
	Address createAddress(Address add);
	List<Address> saveAllAddress(List<Address> add);
}
