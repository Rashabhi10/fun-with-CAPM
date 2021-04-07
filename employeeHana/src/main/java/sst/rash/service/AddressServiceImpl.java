package sst.rash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sst.rash.entities.Address;
import sst.rash.repository.AddressRepository;

@Service("AddressServiceImpl")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addressRepo;

	@Override
	public List<Address> getAllAddress() {
		return addressRepo.findAll();
	}

	@Override
	public Address createAddress(Address add) {
		return addressRepo.save(add);
	}

	@Override
	public List<Address> saveAllAddress(List<Address> add) {
		List<Address> list = (List<Address>) addressRepo.saveAll(add);
		return list;
	}
}
