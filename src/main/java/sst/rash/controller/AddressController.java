package sst.rash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sst.rash.entities.Address;
import sst.rash.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addService;
	
@RequestMapping(method = RequestMethod.GET,value = "/getAddress")
public List<Address> getAllAddress(){
	return addService.getAllAddress();
}

@PostMapping("/newAddress")
public Address createAddress(@RequestBody Address payload) {
	return addService.createAddress(payload);
}

@PostMapping("/saveAddressess")
public List<Address> getAll(@RequestBody List<Address> add){
	List<Address> list = (List<Address>) addService.saveAllAddress(add);
	return list;
}

}
