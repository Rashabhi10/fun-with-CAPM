package sst.rash.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sst.rash.entities.Vendor;
import sst.rash.service.VendorService;


@RestController
public class VendorController {

	@Autowired
	VendorService vendorService;
	
	@RequestMapping("/vendor")
	public HashMap<String, Vendor> getVendors(){
		return vendorService.readAllVendors();
	}
	
	@RequestMapping("/vendor/{vendorcode}")
	public Vendor getVendorById(@PathVariable("vendorcode") String code) {
		return vendorService.getSingleVendorById(code);
	}
	
	@PostMapping("/vendor")
	public Vendor postVendor(@RequestBody Vendor vendor) {
		return vendorService.createVendor(vendor);
	}
	
	@PutMapping("/changevendor")
//	@RequestMapping(method = RequestMethod.PUT, value = "/changevendor")
	public Vendor updateVendor(@RequestBody Vendor changeData) {
		return vendorService.changeVendor(changeData);
	}
	
}
