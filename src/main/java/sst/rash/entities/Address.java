	package sst.rash.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, name = "ID")
	private long addressId;
	@Column(nullable = false,name = "Type")
	private String addressType;
	@Column(nullable = false,name = "Street")
	private String street;
	@Column(nullable = false,name = "City")
	private String city;
	@Column(nullable = false,name = "State")
	private String state;
	@Column(nullable = false,name = "Country")
	private String country;
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", street=" + street + ", city="
				+ city + ", state=" + state + ", country=" + country + "]";
	}
	public Address() {
	}

	
}
