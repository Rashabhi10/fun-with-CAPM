package sst.rash.entities;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Vendor {
	
	public String code;
	public String companyName;
	public String FirstName;
	public String lastName;
	public String website;
	public String email;
	public String status;
	public Date regDate;
	
	
	public Vendor() {
		this.code = "A1001";
		this.companyName = "Wonderland";
		this.FirstName = "Amit";
		this.lastName = "Rai";
		this.website =  "www.anubhavtrainings.com";
		this.email = "contact@anubhavtrainings.com";
		this.status = "A";
		this.regDate = new Date();
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
